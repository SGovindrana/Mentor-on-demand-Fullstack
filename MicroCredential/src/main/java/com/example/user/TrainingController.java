package com.example.user;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@CrossOrigin
@RequestMapping({ "/training" })
public class TrainingController {

	@Autowired
	private TrainingService trainerService;

	@PostMapping
	public Training create(@RequestBody Training training) {
		return trainerService.create(training);
	}

	@GetMapping(path = { "/{id}" })
	public Training findOne(@PathVariable("id") int id) {
		return trainerService.findById(id);
	}

	@PutMapping(path = { "/{id}" })
	public Training update(@PathVariable("id") int id, @RequestBody Training training) {
		training.setId(id);
		return trainerService.update(training);
	}

	@DeleteMapping(path = { "/{id}" })
	public Training delete(@PathVariable("id") int id) {
		return trainerService.delete(id);
	}

	@GetMapping
	public List<Training> findAll() {
		return trainerService.findAll();
	}

	@GetMapping("/findTrainingByMentorId/{mentorId}")
	public List<Training> getTrainingByMentorId(@PathVariable(value = "mentorId") int mentorId) {
		return trainerService.findTrainingByMentorId(mentorId);
	}

	@GetMapping("/findTrainingByUserId/{userId}")
	public List<Training> getTrainingByUsersId(@PathVariable(value = "userId") int userId) {
		return trainerService.findTrainingByUsersId(userId);
	}

	@GetMapping("/findByIdAndMentorId/{id}/{mentorId}")
	public Training getfindByIdAndMentorId(@PathVariable(value = "id") int Id,
			@PathVariable(value = "mentorId") int mentorId) {
		System.out.println(trainerService.findByIdAndMentorId(Id, mentorId));
		return trainerService.findByIdAndMentorId(Id, mentorId);
	}

	@GetMapping("/findByIdAndUserId/{id}/{userId}")
	public Training getfindByIdAndUserId(@PathVariable(value = "id") int Id,
			@PathVariable(value = "userId") int userId) {
		System.out.println(trainerService.findByIdAndUsersId(Id, userId));
		return trainerService.findByIdAndUsersId(Id, userId);
	}

	/*
	 * @GetMapping(path = {"/findTrainingByUserIdCurrent/{userId}"}) public
	 * List<Training> findTrainingByUserIdCurrent(@PathVariable(value = "userId")
	 * int userId) { return trainerService.findTrainingByUserIdCurrent(userId); }
	 */
	/*
	 * @GetMapping(path= {"/findTrainingByStartDateBetween/{startDate}/{endDate}"})
	 * public List<Training> findTrainingByStartDateBetween(@PathVariable(value =
	 * "startDate") String startDate, @PathVariable(value = "endDate") String
	 * endDate) {
	 * 
	 * Date startDate1=new SimpleDateFormat("yyyy-mm-dd").parse(startDate); Date
	 * endDate1=new SimpleDateFormat("yyyy-mm-dd").parse(endDate); return
	 * trainerService.findTrainingByStartDateBetween(startDate1, endDate1);
	 * 
	 * 
	 * SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd"); Date
	 * dateStartDate1; try { dateStartDate1 = simpleDateFormat.parse(startDate); }
	 * catch (ParseException e) { dateStartDate1=new Date(); // TODO Auto-generated
	 * catch block e.printStackTrace(); } Date dateStartDate2; try { dateStartDate2
	 * = simpleDateFormat.parse(endDate); } catch (ParseException e) {
	 * dateStartDate2=new Date(); // TODO Auto-generated catch block
	 * e.printStackTrace(); } return
	 * trainerService.findTrainingByStartDateBetween(dateStartDate1,
	 * dateStartDate2); }
	 */
	@GetMapping(path= {"/findTrainingByStartDateBetween/{startDate}/{endDate}"})
    public List<Training> findTrainingByStartDateBetween(@PathVariable(value = "startDate")  @DateTimeFormat(pattern="yyyy-mm-dd") Date startDate, @PathVariable(value = "endDate") @DateTimeFormat(pattern="yyyy-mm-dd") Date endDate) {
		System.out.println(trainerService.findTrainingByStartDateBetween(startDate, endDate));
		return trainerService.findTrainingByStartDateBetween(startDate, endDate);
	}
	@GetMapping("/findTrainingByMentorIdAndStatusEquals/{mentorId}/{status}")
	public List<Training> getTrainingByMentorIdAndStatusEquals(@PathVariable(value = "mentorId") int mentorId, @PathVariable(value = "status") String status) {
		return trainerService.findTrainingByMentorIdAndStatusEquals(mentorId, status);
	}
      
    @GetMapping("/findTrainingByUsersIdAndStatusEquals/{userId}/{status}")
    public List<Training> getTrainingByUsersIdAndStatusEquals(@PathVariable(value = "userId") int userId,@PathVariable(value = "status") String status) {
        return trainerService.findTrainingByUsersIdAndStatusEquals(userId, status);
    }
    
    
    
    @GetMapping(path="/ChangeCommission/{commission}/{trainingId}")
    public Training ChangeCommission(@PathVariable(value = "commission") Integer commission,
    		@PathVariable(value = "trainingId") Integer trainingId){
	 
	 		Training training=trainerService.findById(trainingId);
	 		training.setCommissionPercent(commission);
	 		 
	 		return trainerService.create(training);
    }
    
    
}



//@DateTimeFormat(pattern="yyyy-mm-dd)
