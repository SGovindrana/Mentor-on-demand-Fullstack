package com.example.admin;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User,Integer>{
	void delete(User user);
	List<User> findAll();
	User findOne(int id);
	User save(User user);

}
