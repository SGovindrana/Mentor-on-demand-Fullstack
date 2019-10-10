package com.example.mentor;

import java.util.Date;

public class UserDtls  extends AuditModel {

private static final long serialVersionUID = 1L;
	
	private long id;
	private String userName = "";
	private String password;
	private String firstName = "";
	private String lastName = "";
	private long contactNumber;
	private String regCode;
	private String role;
	private String linkedinUrl;
	private float yearsOfExperience;
	private boolean active = false;
	private boolean confirmedSignUp = false;
	private Date resetPasswordDate;
	private boolean resetPassword = false;
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
	public long getContactNumber() {
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public float getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isConfirmedSignUp() {
		return confirmedSignUp;
	}
	public void setConfirmedSignUp(boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}
	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
