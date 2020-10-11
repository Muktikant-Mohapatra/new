package com.annotation.controller.rest;

import javax.persistence.Column;

public class RestAddress {
	private String id;
	private String country;
	private String state;
	private String city;
	private String pincode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "RestAddress [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
}
