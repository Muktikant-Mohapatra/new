package com.parking.exception;

public class ParkingLotFullException extends Exception {
	String message;

	public ParkingLotFullException(String s) {
		this.message = s;
	}
}
