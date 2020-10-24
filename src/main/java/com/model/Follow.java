package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "follow")
@Setter
@Getter
public class Follow {
	
	@Id
	@Column(name="id")
	public int followId;
	
	@Column(name="user_id")
	public int userId;
	
	
	@Column(name="following")
	public int following;

}
