package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Action;
import com.repository.ActionRepository;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class ActionController {

	@Autowired
	ActionRepository actionRepository;
	
    @RequestMapping(method=RequestMethod.POST, value="/user/action/like")
    public void addPost(@RequestBody Action action){
    	actionRepository.save(action);    
    }
}
