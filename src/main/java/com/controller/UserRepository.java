package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.model.User;


@SuppressWarnings("rawtypes")
public interface UserRepository extends CrudRepository<User, String> {
	public List<User> findUserByName(String name);
	
	public List<User> findUserById(int id);
	
	
}
