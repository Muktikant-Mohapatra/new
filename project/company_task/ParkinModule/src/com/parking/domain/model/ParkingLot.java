package com.parking.domain.model;

public class ParkingLot {
	private Object[] parkingArea;
	private String entryGate;// first,last,middle

	public ParkingLot(int parkingLot, String entryGate) {
		super();
		this.parkingArea = new Object[parkingLot];
		this.entryGate = entryGate;
	}

	public Object[] getParkingArea() {
		return parkingArea;
	}

	public String getEntryGate() {
		return entryGate;
	}

}
