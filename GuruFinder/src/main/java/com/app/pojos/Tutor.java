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
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TutorQualifications> qualifications=new ArrayList<TutorQualifications>();
	
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TutorExperience> experiences=new ArrayList<TutorExperience>();
	
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CourseBrochure> courseBrochures =new ArrayList<CourseBrochure>();
	
	@OneToOne
	@JoinColumn(name = "login_id")
	private Login login;
	
	public Tutor() {
		super();
	}

	public Tutor(String firstName, String lastName, String mobileNo, String emailId, String password, String gender,
			byte[] profilePhoto, byte[] idProof, LocalDate dob, String tagline, String summary, Integer totalExperience, String status) {
		super(firstName, lastName, mobileNo, emailId, password, gender, profilePhoto, idProof, dob);
		this.tagline = tagline;
		this.summary = summary;
		this.totalExperience = totalExperience;
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString()+ " Tutor [tagline=" + tagline + ", summary=" + summary + ", totalExperience=" + totalExperience
				+ ", registrationDate=" + registrationDate + ", status=" + status + "]";
	}

}
