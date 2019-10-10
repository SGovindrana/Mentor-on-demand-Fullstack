package com.example.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Training {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="_id")
	private long id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "progress")
	private int progress = 0;
	
	@Column(name = "fees")
	private float fees = 0.0f;
	
	@Column(name = "commission_amount")
	private float commissionAmount = 0.0f;
	
	@Column(name = "rating")
	private int rating = 0;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private String startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private String endDate;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "start_time")
	private String startTime;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "amount_received")
	private float amountReceived = 0.0f;
	
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "mentor_id")
	private long mentorId;
	
	@Column(name = "skill_id")
	private long skillId;
	
	@Column(name = "razorpay_payment_id")
	private String razorpayPaymentID;

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

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
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

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getRazorpayPaymentID() {
		return razorpayPaymentID;
	}

	public void setRazorpayPaymentID(String razorpayPaymentID) {
		this.razorpayPaymentID = razorpayPaymentID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
