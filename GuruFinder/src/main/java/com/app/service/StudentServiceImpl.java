package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.app.dto.StudentEduDetailsDto;
import com.app.pojos.StudentEducationalDetails;
import com.app.repository.StudentRepository;

@Transactional
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studeRepo;

	

	
	
	
}
