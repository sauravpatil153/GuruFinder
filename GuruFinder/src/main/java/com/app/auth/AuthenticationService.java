package com.app.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dto.StudentDto;
import com.app.pojos.Login;
import com.app.pojos.Student;
import com.app.pojos.User;
import com.app.pojos.UserRoles;
import com.app.repository.LoginRepository;
import com.app.repository.StudentRepository;
import com.app.securityconfig.JwtService;
import com.app.token.Token;
import com.app.token.TokenRepository;
import com.app.token.TokenType;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	private final StudentRepository studentRepository;
	@Autowired
	private final LoginRepository loginRepository;
	private final JwtService jwtService;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final TokenRepository tokenRepository;

	// String firstName, String lastName, String mobileNo, String emailId, String
	// password,
	// String gender,
	// byte[] profilePhoto, byte[] idProof, LocalDate dob

	public AuthenticationResponse register(StudentDto request) {
		System.out.println(request);
		String passwd = passwordEncoder.encode(request.getPassword());
		Student student = new Student(request.getFirstName(), request.getLastName(), request.getMobileNo(),
				request.getEmailId(), passwd, request.getGender(), request.getProfilePhoto(), request.getIdProof(),
				request.getDob());
		studentRepository.save(student);
		Login newLogin = new Login(request.getEmailId(), passwd, UserRoles.STUDENT);
		loginRepository.save(newLogin);
		var jwtToken = jwtService.generateToken(newLogin);
		return AuthenticationResponse.builder().token(jwtToken).build();
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		String emailId = request.getEmailId();
		System.out.println(request);
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getEmailId(), request.getPassword()));
		Login login = loginRepository.findByEmailId(emailId).orElseThrow();
		if(login == null) {
			System.out.println("it is null");
		}
		System.out.println(login);
		var jwtToken = jwtService.generateToken(login);
		revokeAllUserTokens(login);
		saveUserToken(login, jwtToken);
		return AuthenticationResponse.builder().token(jwtToken).build();
	}

	private void saveUserToken(Login login, String jwtToken) {
		var token = Token.builder().login(login).token(jwtToken).tokenType(TokenType.BEARER).expired(false)
				.revoked(false).build();
		tokenRepository.save(token);
	}

	private void revokeAllUserTokens(Login login) {
		var validUserTokens = tokenRepository.findAllValidTokenByLogin(login.getLoginId());
		if (validUserTokens.isEmpty())
			return;
		validUserTokens.forEach(token -> {
			token.setExpired(true);
			token.setRevoked(true);
		});
		tokenRepository.saveAll(validUserTokens);
	}
}
