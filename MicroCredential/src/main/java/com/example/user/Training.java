package com.example.user;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "training")
public class Training  extends AuditModel{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "progress")
	private int progress = 0;

	
	
	
	

	@Column(name = "fees")
	private float fees = 0.0f;
	
	@Column(name = "commission_amount")
	private float commissionAmount = 0.0f;
	
	@Column(name = "commission_percent")
	private int commissionPercent = 0;
	
	public int getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(int commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	@Column(name = "rating")
	private int rating = 0;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private Date startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private Date endDate;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "start_time")
	private String startTime;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "amount_received")
	private float amountReceived;
	
	
	@Column(name = "amount_to_mentor")
	private String amountToMentor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mentor_id")
	private Mentor mentor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="technology_id")
	private Technology technology;
	
	
	@OneToMany(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
		@JoinTable(name="training_user", joinColumns = {
				@JoinColumn(name="Trainer_id", nullable=false, updatable=false)},
				inverseJoinColumns= {@JoinColumn(name="User_id", nullable=false, updatable=false)}
		)
	private List <User> users;
	
	@OneToMany(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="training_skill", joinColumns = {
			@JoinColumn(name="Trainer_id", nullable=false, updatable=false)},
			inverseJoinColumns= {@JoinColumn(name="Skill_id", nullable=false, updatable=false)}
	)
	private List <Skill> skills;
	
	@OneToMany(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="training_payment", joinColumns = {
			@JoinColumn(name="Trainer_id", nullable=false, updatable=false)},
			inverseJoinColumns= {@JoinColumn(name="Payment_id", nullable=false, updatable=false)}
	)
	private List <Payment> payment;


	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
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

	
	
	

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public String getAmountToMentor() {
		return amountToMentor;
	}

	public void setAmountToMentor(String amountToMentor) {
		this.amountToMentor = amountToMentor;
	}

	
}
