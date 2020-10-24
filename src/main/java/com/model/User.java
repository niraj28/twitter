package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name="id")
	public int id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="password")
	public String password;

}
