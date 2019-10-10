package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	private MentorRepository repository ;

	@Override
	public Mentor create(Mentor mentor) {
		// TODO Auto-generated method stub 
		return repository.save(mentor);
	
	}

	@Override
	public Mentor delete(int id) {
		Mentor mentor = findById(id);
		if(mentor!=null) {
			repository.delete(mentor);
		}
		// TODO Auto-generated method stub
		return mentor;
	}

	@Override
	public List<Mentor> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	@Override
	public Mentor findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
		
	}

	@Override
	public Mentor update(Mentor mentor) {
		// TODO Auto-generated method stub
		return repository.save(mentor);
	}

	@Override
	public Mentor findMentor(String userName, String password) {
		// TODO Auto-generated method stub
		return repository.findMentor(userName, password);
	}
 
}
