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
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Entity
@Table(name = "tutors")
@Audited
public class Tutor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tutor_id")
	private Long tutorId;
	@NotAudited
	@Column(name = "first_name", length = 30, nullable = false)
	private String firstName;
	@NotAudited
	@Column(name = "last_name", length = 30, nullable = false)
	private String lastName;
	@NotAudited
	@Column(name = "mobile_no", length = 12, nullable = false)
	private String mobileNo;
	@NotAudited
	@Column(length = 10, nullable = false)
	private String gender;
	@NotAudited
	@Column(name = "email_id", length = 50, nullable = false, unique = true)
	private String emailId;
	@NotAudited
	@Column(length = 20, nullable = false)
	private String password;
	@NotAudited
	@Lob
	@Column(name = "profile_photo", nullable = false)
	private byte[] profilePhoto;
	@NotAudited
	@Lob
	@Column(name = "id_proof", nullable = false)
	private byte[] idProof;
	@NotAudited
	@Column(nullable = false)
	private LocalDate dob;
	@NotAudited
	@Column(length = 150, nullable = false)
	private String tagline;
	@NotAudited
	@Column(nullable = false)
	private String summary;
	@NotAudited
	@Column(name = "total_experience", nullable = false)
	private Integer totalExperience;
	@CreationTimestamp
	@JoinColumn(name = "registration_date")
	private LocalDate registrationDate;
	private String status;
	@NotAudited
	@OneToOne(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private Address address;
	
	@NotAudited
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TutorQualifications> qualifications=new ArrayList<TutorQualifications>();
	
	@NotAudited
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TutorExperience> experiences=new ArrayList<TutorExperience>();
	
	@NotAudited
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CourseBrochure> courseBrochures =new ArrayList<CourseBrochure>();
	
	public Tutor() {
		super();
	}

	public Tutor(String firstName, String lastName, String mobileNo, String gender, String emailId, String password,
			byte[] profilePhoto, byte[] idProof, LocalDate dob, String tagline, String summary,
			Integer totalExperience) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.emailId = emailId;
		this.password = password;
		this.profilePhoto = profilePhoto;
		this.idProof = idProof;
		this.dob = dob;
		this.tagline = tagline;
		this.summary = summary;
		this.totalExperience = totalExperience;
	}

	public Long getTutorId() {
		return tutorId;
	}

	public void setTutorId(Long tutorId) {
		this.tutorId = tutorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(byte[] profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public byte[] getIdProof() {
		return idProof;
	}

	public void setIdProof(byte[] idProof) {
		this.idProof = idProof;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}
	
}
