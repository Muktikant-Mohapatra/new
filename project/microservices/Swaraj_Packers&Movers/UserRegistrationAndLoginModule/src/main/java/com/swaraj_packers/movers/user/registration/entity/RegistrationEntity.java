package com.swaraj_packers.movers.user.registration.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "user_details")
public class RegistrationEntity {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	private String id;
	@Min(value = 1, message = "First name must contain one letter")
	@Max(value = 20, message = "First name must be between twenty letter")
	@Column(name = "first_name")
	private String firstName;
	@Min(value = 1, message = "First name must contain one letter")
	@Max(value = 20, message = "First name must be between twenty letter")
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "gender")
	private char gender;
	@Past(message = "date of birth must be in past")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "phone")
	private long phone;
	@Column(name = "password")
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
