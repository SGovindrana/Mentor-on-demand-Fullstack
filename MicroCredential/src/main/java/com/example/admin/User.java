package com.example.admin;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column (name="last_name")
	private String lastName;
	
	
	@Column(name="contact_number")
	private Long contactNumber;
	
	@Column(name="reg_code")
	private String regCode="";
	
	@Column(name="role")
	private String roll=null;
	
	@Column(name="linkdin_url")
	private String linkdinUrl=null;
	
	@Column(name="years_of_experience")
	private Float yearsofExperience;
	
	@Column(name="active")
	private Boolean active=false;
	
	@Column(name="confirmed_signup")
	private Boolean confirmedSignup =false;
	
	@Column(name="reset_password")
	private Boolean resetPassword =false;
	
	@Column(name="reset_password_date")
	private Boolean resetPasswordDate =false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getLinkdinUrl() {
		return linkdinUrl;
	}

	public void setLinkdinUrl(String linkdinUrl) {
		this.linkdinUrl = linkdinUrl;
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

	public Boolean getResetPasswordDate() {
		return resetPasswordDate;
	}

	public void setResetPasswordDate(Boolean resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	
	
	
	
	
}
