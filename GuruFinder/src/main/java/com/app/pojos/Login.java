package com.app.pojos;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.token.Token;

import lombok.Data;

@Entity
@Data
@Table(name = "login")
public class Login implements UserDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id")
	private Long loginId;
	@Column(name = "email_id", length = 50, nullable = false, unique = true)
	private String emailId;
	@Column(length = 500, nullable = false)
	private String password;
	@Column(name="user_role", nullable = false, length=30)
	@Enumerated(EnumType.STRING)
	private UserRoles userRole;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, orphanRemoval = true)
	private Student student;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, orphanRemoval = true)
	private Tutor tutor;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, orphanRemoval = true)
	private Admin admin;
	
	@OneToMany(mappedBy = "login")
	private List<Token> tokens;
	
	public Login(String emailId, String password, UserRoles userRole) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.userRole = userRole;
	}
	
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", emailId=" + emailId + ", userRole=" + userRole + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(userRole.name()));
	}

	@Override
	public String getUsername() {
		return emailId;
	}

	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
