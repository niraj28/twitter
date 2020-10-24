package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Follow;

public interface FollowRepository extends CrudRepository<Follow, String>{
	public List<Follow> findByUserId(int userId);
}
