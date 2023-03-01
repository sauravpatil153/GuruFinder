package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.StudentEducationalDetails;
import com.app.service.StudentEduDetailsService;
import com.app.service.StudentService;
import com.app.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studService;
	
	@Autowired
	private StudentEduDetailsService detailsService;
	
	@PostMapping("/edudetails")
	public void addStudentEducationalDetails
	(@RequestParam Long studentId, @RequestBody StudentEducationalDetails request){
		System.out.println(studentId);
		System.out.println(request);
		detailsService.addStudentEducationalDetails(studentId,request);
		System.out.println("Student Educational Details added successfully");
	}
}
