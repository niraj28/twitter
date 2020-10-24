package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.UserRepository;
import com.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	
	public void addUser(User user) {
		userRepository.save(user);
		
	}

	public List<User> findUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findUserByName(name);
	}

	public List<User> findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findUserById(id);
	}

}
