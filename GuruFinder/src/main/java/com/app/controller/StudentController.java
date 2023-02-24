package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServiceImpl studService;
	
	@GetMapping("/{id}")
	public void deleteStudentById(@PathVariable Long id) {
		studService.removeStudById(id);
		System.out.println("deleted successfully...");
	}
}