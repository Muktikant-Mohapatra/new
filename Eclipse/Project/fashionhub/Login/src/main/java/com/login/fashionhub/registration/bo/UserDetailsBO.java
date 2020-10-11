package com.login.fashionhub.registration.bo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.login.fashionhub.login.bo.LoginCredentialsBo;

@Entity(name = "USER_PERSONAL_CREDENTIAL")
public class UserDetailsBO extends AbstractIdGenerator {

	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "AGE")
	private int age;
	@Column(name = "PHONE")
	private long phone;
	@OneToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "RELATED_ACC_ID")
	private LoginCredentialsBo loginCredential;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public LoginCredentialsBo getLoginCredential() {
		return loginCredential;
	}

	public void setLoginCredential(LoginCredentialsBo loginCredential) {
		this.loginCredential = loginCredential;
	}

	@Override
	public String toString() {
		return "UserDetailsBO [id=" + super.getId() + ", name=" + name + ", gender=" + gender + ", date=" + dob
				+ ", phone=" + phone + "loginDetails =" + loginCredential	 + "]";
	}

}
