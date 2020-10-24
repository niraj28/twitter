package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Post;

public interface PostRepository extends CrudRepository<Post, String>{
	public List<Post> findByCreatedBy(Integer createdBy);
}
