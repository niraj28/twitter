package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "post")
@Setter
@Getter
public class Post {

	
	@Id
	@Column(name="id")
	public int postId;
	
	@Column(name="feed")
	public String feed;
	
	
	@Column(name="created_by")
	public int createdBy;
	
	
	@Column(name="created_at")
	public String createdAt; 
}
