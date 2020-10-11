package com.annotation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "book_id")
public class Book extends Publisher {
	@Column
	private String book_name;
	@ManyToOne(fetch = FetchType.LAZY)
	private Users user;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private Set<Publisher> publisher;

	public String getName() {
		return book_name;
	}

	public void setName(String name) {
		this.book_name = name;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Set<Publisher> getPublisher() {
		return publisher;
	}

	public void setPublisher(Set<Publisher> publisher) {
		this.publisher = publisher;
	}

}
