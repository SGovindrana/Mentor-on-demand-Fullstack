package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepository repository ;

	@Override
	public Skill create(Skill skill) {
		// TODO Auto-generated method stub 
		return repository.save(skill);
	
	}

	@Override
	public Skill delete(int id) {
		Skill skill = findById(id);
		if(skill!=null) {
			repository.delete(skill);
		}
		// TODO Auto-generated method stub
		return skill;
	}

	@Override
	public List<Skill> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	@Override
	public Skill findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
		
	}

	@Override
	public Skill update(Skill skill) {
		// TODO Auto-generated method stub
		return repository.save(skill);
	}
 
}
