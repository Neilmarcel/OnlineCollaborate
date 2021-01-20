package com.coll.OnlineCollaboration.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class User extends DomainResponse implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	@Transient
	private String 
}
