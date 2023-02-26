package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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

@Entity
@Table(name = "students")
public class Student extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long studentId;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private StudentEducationalDetails details;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CourseEnrollment> courseEnrollment=new ArrayList<CourseEnrollment>();
	
	@OneToOne
	@JoinColumn(name = "login_id")
	private Login login;
	
	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String mobileNo, String emailId, String password, String gender,
			byte[] profilePhoto, byte[] idProof, LocalDate dob) {
		super(firstName, lastName, mobileNo, emailId, password, gender, profilePhoto, idProof, dob);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return super.toString()+" Student [studentId=" + studentId + "]";
	}
	
}
