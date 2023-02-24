package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.StudentRepository;

@Transactional
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studeRepo;

	public void removeStudById(Long id) {
		studeRepo.deleteById(id);
	}
	
	
}
