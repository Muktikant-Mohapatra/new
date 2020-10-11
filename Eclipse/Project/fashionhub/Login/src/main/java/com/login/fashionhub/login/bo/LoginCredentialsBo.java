package com.login.fashionhub.login.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.login.fashionhub.registration.bo.AbstractIdGenerator;
import com.login.fashionhub.registration.bo.UserDetailsBO;

@Entity(name = "USER_LOGIN_CREDENTIAL")
public class LoginCredentialsBo extends AbstractIdGenerator {
	@Column
	private String email;
	@Column
	private String password;
	/*
	 * @OneToOne(mappedBy = "loginCredential") private UserDetailsBO userDetails;
	 */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public UserDetailsBO getUserDetails() { return userDetails; }
	 * 
	 * public void setUserDetails(UserDetailsBO userDetails) { this.userDetails =
	 * userDetails; }
	 */

	@Override
	public String toString() {
		return "LoginCredentialsBo [email=" + email + ", password=" + password + "]";
	}

}
