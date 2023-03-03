package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.CourseBrochure;
import com.app.repository.CourseBrochureRepository;

@Service
@Transactional
public class CourseBrochureServiceImpl implements CourseBrochureService{
	@Autowired
	CourseBrochureRepository courseBrochureRepository;

	@Override
	public List<CourseBrochure> findCoursesBySSL(String stream, String courseName, String level) {
		return courseBrochureRepository.findByStreamAndCourseNameAndLevel(stream, courseName, level);
	}

	@Override
	public List<CourseBrochure> findCoursesByKeyword(String keyword) {
		List<CourseBrochure> courseBrochureList=new ArrayList<CourseBrochure>();
		courseBrochureList.addAll(courseBrochureRepository.findByStream(keyword));
		courseBrochureList.addAll(courseBrochureRepository.findByCourseName(keyword));
		courseBrochureList.addAll(courseBrochureRepository.findByLevel(keyword));
		return courseBrochureList;
	}

}
