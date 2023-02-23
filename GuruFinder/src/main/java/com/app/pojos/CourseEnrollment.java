package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "course_enrollment")
public class CourseEnrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enrollment_id")
	private Long enrollmentId;
	@Column(name = "enrollment_date")
	@CreatedDate
	private LocalDate enrollmentDate;
	@Column(name = "payment_transaction_id", length = 50, nullable = false)
	private String paymentTransactionId;
	
	public CourseEnrollment() {
		super();
	}

	public CourseEnrollment(LocalDate enrollmentDate, String paymentTransactionId) {
		super();
		this.enrollmentDate = enrollmentDate;
		this.paymentTransactionId = paymentTransactionId;
	}

	public Long getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getPaymentTransactionId() {
		return paymentTransactionId;
	}

	public void setPaymentTransactionId(String paymentTransactionId) {
		this.paymentTransactionId = paymentTransactionId;
	}

	@Override
	public String toString() {
		return "CourseEnrollment [enrollmentId=" + enrollmentId + ", enrollmentDate=" + enrollmentDate
				+ ", paymentTransactionId=" + paymentTransactionId + "]";
	}
	
	
}
