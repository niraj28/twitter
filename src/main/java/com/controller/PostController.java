package com.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Post;
import com.repository.PostRepository;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class PostController {
	

	@Autowired
	PostRepository postRepository;
	
    @RequestMapping(method=RequestMethod.POST, value="/user/post/save")
    public void addPost(@RequestBody Post post){
    	post.setCreatedAt(new Timestamp(System.currentTimeMillis()).toString());
    	postRepository.save(post);
        
    }
}
