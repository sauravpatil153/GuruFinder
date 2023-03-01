package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class Home {
	
	@PreAuthorize("STUDENT")
	@RequestMapping("/welcome")
	public String welcome() {
		return "unauthorized page....";
	}
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("hello everyone...");
	}
}
