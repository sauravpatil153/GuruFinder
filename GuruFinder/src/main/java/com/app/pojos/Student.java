package com.app.pojos;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "first_name", length = 30, nullable = false)
	private String firstName;
	@Column(name = "last_name", length = 30, nullable = false)
	private String lastName;
	@Column(name = "mobile_no", length = 12, nullable = false)
	private String mobileNo;
	@Column(name = "email_id", length = 50, nullable = false, unique = true)
	private String emailId;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(length = 10, nullable = false)
	private String gender;
	@Column(name = "profile_photo", nullable = false)
	private byte[] profilePhoto;
	@Column(name = "id_proof", nullable = false)
	private byte[] idProof;
	@Column(nullable = false)
	private LocalDate dob;
	
	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String mobileNo, String emailId, String password,
			String gender, byte[] profilePhoto, byte[] idProof, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
		this.gender = gender;
		this.profilePhoto = profilePhoto;
		this.idProof = idProof;
		this.dob = dob;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo="
				+ mobileNo + ", emailId=" + emailId + ", gender=" + gender + ", profilePhoto="
				+ Arrays.toString(profilePhoto) + ", idProof=" + Arrays.toString(idProof) + ", dob=" + dob + "]";
	}
	
}
