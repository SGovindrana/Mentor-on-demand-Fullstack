package com.example.user;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity

@Table(name="user")
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column (name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_number")
	private Long contactNumber;
	
	@Column(name="reg_code")
	private String regCode="";
	
	@Column(name="role")
	private String role=null;
	
	@Column(name="linkedin_url")
	private String linkedinUrl=null;
	
	@Column(name="years_of_experience")
	private Float yearsofExperience;
	
	@Column(name="active")
	private Boolean active=false;
	
	@Column(name="confirmed_signup")
	private Boolean confirmedSignup =false;
	
	@Column(name="reset_password")
	private Boolean resetPassword =false;
	
	@Column(name="reset_password_date")
	private Date resetPasswordDate;
	
	/* @ManyToMany(cascade=CascadeType.ALL, mappedBy="users")
	List<Training> training; */

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Long getContactNumber() {
		return contactNumber;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLinkdinUrl() {
		return linkedinUrl;
	}

	public void setLinkdinUrl(String linkdinUrl) {
		this.linkedinUrl = linkdinUrl;
	}

	public Float getYearsofExperience() {
		return yearsofExperience;
	}

	public void setYearsofExperience(Float yearsofExperience) {
		this.yearsofExperience = yearsofExperience;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getConfirmedSignup() {
		return confirmedSignup;
	}

	public void setConfirmedSignup(Boolean confirmedSignup) {
		this.confirmedSignup = confirmedSignup;
	}

	public Boolean getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	

	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}

	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	/*
	 * public List<Training> getTraining() { return training; }
	 * 
	 * public void setTraining(List<Training> training) { this.training = training;
	 * }
	 */
	
	
	
	
}
