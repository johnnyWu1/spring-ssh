package com.xiaoji.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {
	// Fields
	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "name", length = 50)
	private String username;
	@Column(name = "password", length = 100)
	private String password;


	// Constructors
	public User(Integer id, String name, String password) {
		super();
		this.id = id;
		this.username = name;
		this.password = password;
	}

	public User() {
	}


	public Integer getId() {
		return this.id;
	}

	
	
	public void setBookId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String name) {
		this.username = name;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}