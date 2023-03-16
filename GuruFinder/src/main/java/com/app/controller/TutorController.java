package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Address;
import com.app.pojos.TutorExperience;
import com.app.pojos.TutorQualifications;
import com.app.service.AddressService;
import com.app.service.TutorExperienceService;
import com.app.service.TutorQualificationsService;

@RestController
@RequestMapping("/tutor")
public class TutorController {
	
	@Autowired
	private TutorQualificationsService tutorQualificationsService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private TutorExperienceService tutorExperienceService;
	
	@PostMapping("/qualificationdetails")
	public ResponseEntity<?> addTutorQualifications
	(@RequestParam Long tutorId, @RequestBody TutorQualifications tutorQualifications){
		return ResponseEntity.ok(tutorQualificationsService.addTutorQualifications(tutorId,tutorQualifications));
	}
	
	@PostMapping("/address")
	public ResponseEntity<?> addTutorAddress
	(@RequestParam Long tutorId, @RequestBody Address address){
		System.out.println(tutorId);
		System.out.println(address);
		return ResponseEntity.ok(addressService.addTutorAddress(tutorId,address));
	}
	
	@PostMapping("/experience")
	public ResponseEntity<?> addTutorExperience
	(@RequestParam Long tutorId, @RequestBody TutorExperience tutorExperience){
		System.out.println(tutorId);
		System.out.println(tutorExperience);
		return ResponseEntity.ok(tutorExperienceService.addTutorExperience(tutorId,tutorExperience));
	}

}
