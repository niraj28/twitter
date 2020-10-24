package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class UserController {

	 @Autowired
	    UserService userService;
	      
	    @RequestMapping(method=RequestMethod.POST, value="/user/save")
	    public void addBook(@RequestBody User user){
	    	userService.addUser(user);
	        
	    }
	    
	    @RequestMapping(method=RequestMethod.GET, value="/user/userId/{id}")
	    public List<User> findUserById(@PathVariable int id){
	    	return userService.findUserById(id);
	        
	    }
	    
	    @RequestMapping(method=RequestMethod.GET, value="/user/username/{name}")
	    public List<User> findUserByName(@PathVariable String name){
	    	return userService.findUserByName(name);
	        
	    }
	    
	
}
