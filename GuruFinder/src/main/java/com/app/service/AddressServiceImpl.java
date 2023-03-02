package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Address;
import com.app.pojos.Student;
import com.app.repository.AddressRepository;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public String addStudentAddress(Long studentId, Address address) {
		Student existingStudent=studentRepository.findById(studentId).orElseThrow();
		addressRepository.save(address);
		existingStudent.addAddress(address);
		return "Address added successfully...";
	}

}
