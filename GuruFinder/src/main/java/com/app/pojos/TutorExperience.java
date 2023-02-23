package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutor_experiences")
public class TutorExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tutor_experience_id")
	private Long tutorExperienceId;
	@Column(name = "number_of_years",nullable = false)
	private Integer numberOfYears;
	@Column(name = "organisation_name",length = 30, nullable = false)
	private String organisationName;
	@Column(length = 30, nullable = false)
	private String field;
	@Column(name = "experience_certicate", nullable = false)
	private byte[] experienceCerticate;
	
	public TutorExperience() {
		super();
	}

	public TutorExperience(Integer numberOfYears, String organisationName, String field, byte[] experienceCerticate) {
		super();
		this.numberOfYears = numberOfYears;
		this.organisationName = organisationName;
		this.field = field;
		this.experienceCerticate = experienceCerticate;
	}

	public Long getTutorExperienceId() {
		return tutorExperienceId;
	}

	public void setTutorExperienceId(Long tutorExperienceId) {
		this.tutorExperienceId = tutorExperienceId;
	}

	public Integer getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(Integer numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public byte[] getExperienceCerticate() {
		return experienceCerticate;
	}

	public void setExperienceCerticate(byte[] experienceCerticate) {
		this.experienceCerticate = experienceCerticate;
	}
}