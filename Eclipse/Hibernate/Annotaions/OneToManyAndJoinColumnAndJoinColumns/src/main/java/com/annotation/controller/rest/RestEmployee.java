package com.annotation.controller.rest;

import java.util.List;

import javax.persistence.Column;

public class RestEmployee {
	private String id;
	private String name;
	private String email;
	private String department;
	private List<RestAddress> address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<RestAddress> getAddress() {
		return address;
	}
	public void setAddress(List<RestAddress> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "RestEmployee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", address=" + address + "]";
	}
	
}
