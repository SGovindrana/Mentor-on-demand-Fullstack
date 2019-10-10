package com.example.user;

public class PaymentDtls extends AuditModel {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String txnType;
	private float amount;
	private String remarks;
	private long mentorId;
	private String mentorName;
	private long trainingId;
	private String skillName;
	private float totalAmountToMentor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}
	public void setTotalAmountToMentor(float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
