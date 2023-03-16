package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthenticationRequest;
import com.app.dto.AuthenticationResponse;
import com.app.pojos.Student;
import com.app.pojos.Tutor;
import com.app.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class AuthenticationController {
	private final AuthenticationService service;
	
	@PostMapping("/register/student")
	public ResponseEntity<AuthenticationResponse> registerNewStudent(@RequestBody Student request){
		return ResponseEntity.ok(service.registerStudent(request));	
	}
	
	@PostMapping("/register/tutor")
	public ResponseEntity<AuthenticationResponse> registerNewTutor(@RequestBody Tutor request){
		return ResponseEntity.ok(service.registerTutor(request));
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
		System.out.println(request);
		return ResponseEntity.ok(service.authenticate(request));
		
	}
}
