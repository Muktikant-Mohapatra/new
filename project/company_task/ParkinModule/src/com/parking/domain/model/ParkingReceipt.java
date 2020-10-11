package com.parking.domain.model;

import java.util.Date;

public class ParkingReceipt {
	private String id;
	private String registrationNumber;
	private String colour;
	private int parkingSlot;
	private Date entryTime;

	public ParkingReceipt(String id, String registrationNumber, String colour, int parkingSlot, Date entryTime) {
		super();
		this.id = id;
		this.registrationNumber = registrationNumber;
		this.colour = colour;
		this.parkingSlot = parkingSlot;
		this.entryTime = entryTime;
	}

	public String getId() {
		return id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getColour() {
		return colour;
	}

	public int getParkingSlot() {
		return parkingSlot;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	@Override
	public String toString() {
		return "ParkingReceiptDto [id=" + id + ", registrationNumber=" + registrationNumber + ", colour=" + colour
				+ ", parkingSlot=" + parkingSlot + ", entryTime=" + entryTime + "]";
	}

}
