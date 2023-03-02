package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

}