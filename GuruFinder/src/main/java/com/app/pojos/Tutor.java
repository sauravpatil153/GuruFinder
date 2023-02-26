package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Entity
@Table(name = "tutors")
@AuditTable(value = "tutor_verification")
public class Tutor extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tutor_id")
	@Audited
	private Long tutorId;
	@Column(name = "first_name", length = 30, nullable = false)
	private String tagline;
	@Column(nullable = false)
	private String summary;
	@Column(name = "total_experience", nullable = false)
	private Integer totalExperience;
	@Audited
	@CreationTimestamp
	@JoinColumn(name = "registration_date")
	private LocalDate registrationDate;
	@Audited
	private String status;
	
	@OneToOne(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private Address address;
	
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TutorQualifications> qualifications=new ArrayList<TutorQualifications>();
	
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TutorExperience> experiences=new ArrayList<TutorExperience>();
	
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CourseBrochure> courseBrochures =new ArrayList<CourseBrochure>();
	
	public Tutor() {
		super();
	}

	
}
