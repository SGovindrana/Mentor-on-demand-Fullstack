package com.example.user;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TrainingDtls extends AuditModel{

	private static final long serialVersionUID = 1L;
	private long id;
	private String status;
	private Integer progress;
	private float commissionAmount;
	private int rating;
	private float avgRating=0.0f;
	@JsonFormat(pattern="yyyy-MM-dd")
	private String startDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private String endDate;
	@JsonFormat(pattern="HH:mm:ss")
	private String startTime;
	@JsonFormat(pattern="HH:mm:ss")
	private String endTime;
	private float amountReceived;
	private long userId;
	private String userName;
	private long mentorId;
	private String mentorName;
	private Long skillId;
	private String skillName;
	private float fees;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getProgress() {
		return progress;
	}
	public void setProgress(Integer progress) {
		this.progress = progress;
	}
	public float getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public float getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
