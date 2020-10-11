package com.annotation.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee")
@SecondaryTables({ @SecondaryTable(name = "address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id")),
		@SecondaryTable(name = "department", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id")) })
public class Employee {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(insertable = false, table = "employee")
	private String id;
	@Column(name = "name", length = 200, table = "employee")
	private String name;
	@Column(name = "email", length = 200, unique = true)
	private String email;
	@Column(name = "country", length = 200, table = "address")
	private String country;
	@Column(name = "state", length = 200, table = "address")
	private String state;
	@Column(name = "city", length = 200, table = "address")
	private String city;
	@Column(name = "pincode", length = 200, table = "address")
	private String pincode;
	@Column(name = "dept", length = 200, table = "department")
	private String department;

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
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
