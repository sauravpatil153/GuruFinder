package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.TutorQualifications;
import com.app.service.TutorQualificationsService;

@RestController
@RequestMapping("/tutor")
public class TutorController {
	
	@Autowired
	private TutorQualificationsService tutorQualificationsService;
	
	@PostMapping("/qualificationdetails")
	public ResponseEntity<?> addTutorQualifications
	(@RequestParam Long tutorId, @RequestBody TutorQualifications tutorQualifications){
		return ResponseEntity.ok(tutorQualificationsService.addTutorQualifications(tutorId,tutorQualifications));
	}
}
