package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "action")
@Setter
@Getter
public class Action {
	
	@Id
	@Column(name="id")
	public int actionId;
	
	@Column(name="posted_by")
	public int postedBy;
	
	
	@Column(name="liked_by")
	public int likedBy;

}
