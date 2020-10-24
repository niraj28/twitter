package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Action;

public interface ActionRepository extends CrudRepository<Action, String> {
	public List<Action> findByLikedBy(int likedBy);
}
