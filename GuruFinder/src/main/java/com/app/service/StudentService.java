package com.app.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.CourseEnrollment;
import com.app.pojos.StudentEducationalDetails;
import com.app.repository.CourseEnrollmentRepository;

public interface StudentService {
	 
	String addEnrollment(Long studentId, Long courseId, CourseEnrollment newCourseEnrollment);
}
