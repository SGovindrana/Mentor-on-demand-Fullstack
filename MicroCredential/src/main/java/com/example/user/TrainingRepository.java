package com.example.user;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface TrainingRepository extends Repository<Training, Integer>{
	
	void delete(Training training);
	List<Training> findAll();
	Training findOne(int id);
	Training save(Training training);
	
	@Query("select training from Training training where training.mentor.id=?")
	List<Training> findTrainingByMentorId(int mentorId);
	
	//@Query("select training from Training training where training.userId=? and training.status='completed'")
	List<Training> findTrainingByUsersId(int userId);
	
	@Query("select training from Training training where training.id=? and training.mentor.id=?")
	Training findByIdAndMentorId(int id, int mentorId);
	
	//@Query("select training from Training training where training.id=? and users.userId=?")
	Training findByIdAndUsersId(int trainingId, int userId);
	
	
	
	/*
	 * @Query("select training from Training training where training.userId=? and training.status='in progress'"
	 * ) List<Training> findTrainingByUserIdCurrent(int userId);
	 */
	//@Query("Select training from Training training where training.startDate between ? and ?")
	List<Training> findTrainingByStartDateBetween(Date startDate, Date endDate);
	
	
	List<Training> findTrainingByMentorIdAndStatusEquals(int mentorId, String status);

	List<Training> findTrainingByUsersIdAndStatusEquals(int userId, String status);
}
