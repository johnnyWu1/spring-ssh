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
@Table(name = "book")
public class Book implements java.io.Serializable {

	// Fields
	
	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "book_id", unique = true, nullable = false)
	private Integer bookId;
	@Column(name = "name", length = 50)
	private String name;
	@Column(name = "description", length = 100)
	private String description;

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** full constructor */
	public Book(String name, String description) {
		this.name = name;
		this.description = description;
	}


	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}