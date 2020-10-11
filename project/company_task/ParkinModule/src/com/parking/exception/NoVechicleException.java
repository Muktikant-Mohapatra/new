package com.parking.exception;

public class NoVechicleException extends Exception {
	String message;

	public NoVechicleException(String s) {
		this.message = s;
	}
}
