package com.example.mentor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository ;

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub 
		return repository.save(user);
	
	}

	@Override
	public User delete(int id) {
		User user = findById(id);
		if(user!=null) {
			repository.delete(user);
		}
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
		
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}
 
}
