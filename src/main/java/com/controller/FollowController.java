package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Follow;
import com.repository.FollowRepository;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class FollowController {

	@Autowired
	FollowRepository followRepository;
	
    @RequestMapping(method=RequestMethod.POST, value="/user/follow/save")
    public void addPost(@RequestBody Follow follow){
    	followRepository.save(follow);    
    }
}
