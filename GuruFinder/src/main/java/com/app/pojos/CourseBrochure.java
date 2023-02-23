package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_brochures")
public class CourseBrochure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Long courseId;
	@Column(name = "course_name", length = 30, nullable = false)
	private String courseName;
	@Column(length = 30, nullable = false)
	private String stream;
	@Column(length = 30, nullable = false)
	private String level;
	@Column(nullable = false)
	private Integer duration;
	@Column(nullable = false)
	private Double fees;
	@Column(length = 10, nullable = false)
	private String mode;
	
	public CourseBrochure() {
		super();
	}

	public CourseBrochure(String courseName, String stream, String level, Integer duration, Double fees, String mode) {
		super();
		this.courseName = courseName;
		this.stream = stream;
		this.level = level;
		this.duration = duration;
		this.fees = fees;
		this.mode = mode;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
