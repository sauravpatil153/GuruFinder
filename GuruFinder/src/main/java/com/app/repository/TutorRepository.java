package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Tutor;
@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {

}
