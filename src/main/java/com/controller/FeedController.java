package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Action;
import com.model.Follow;
import com.model.Post;
import com.repository.ActionRepository;
import com.repository.FollowRepository;
import com.repository.PostRepository;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class FeedController {
	@Autowired
	ActionRepository actionRepository;
	
	@Autowired
	FollowRepository followRepository;
	

	@Autowired
	PostRepository postRepository;
	
	@SuppressWarnings("null")
	@RequestMapping(method=RequestMethod.GET, value="/user/feed/{id}")
    public List<Post> getPost(@PathVariable int id){
		List<Integer> createdBy= new ArrayList<>();
		List <Action> actions=actionRepository.findByLikedBy(id);
		for(Action action: actions) {
			createdBy.add(action.getLikedBy());
		}
		List <Follow> follows=followRepository.findByUserId(id);
		for(Follow follow: follows) {
			createdBy.add(follow.getFollowing());
		}
		List<Post> posts = new ArrayList<>();
		for(Integer i:createdBy ) {
			posts.addAll(postRepository.findByCreatedBy(i));
		}
		return posts;
    }
}
