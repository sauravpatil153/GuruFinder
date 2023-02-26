package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id")
	private Long loginId;
	@Column(name = "email_id", length = 50, nullable = false, unique = true)
	private String emailId;
	@Column(length = 20, nullable = false)
	private String password;
	private UserRoles userRole;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, orphanRemoval = true)
	private Student student;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, orphanRemoval = true)
	private Tutor tutor;
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, orphanRemoval = true)
	private Admin admin;
	
	public Login(String emailId, String password, UserRoles userRole) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.userRole = userRole;
	}
	
	public Long getLoginId() {
		return loginId;
	}
	
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
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
	
	public UserRoles getUserRole() {
		return userRole;
	}
	
	public void setUserRole(UserRoles userRole) {
		this.userRole = userRole;
	}
	
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", emailId=" + emailId + ", userRole=" + userRole + "]";
	}

}
