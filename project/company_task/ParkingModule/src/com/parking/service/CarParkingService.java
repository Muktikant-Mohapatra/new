package com.parking.service;

import java.util.Calendar;
import java.util.Random;

import com.parking.domain.model.Car;
import com.parking.domain.model.ParkingLot;
import com.parking.domain.model.ParkingReceipt;

public class CarParkingService implements ParkingService {
	private String entryGate;
	private Object[] parkingArea;
	private Car car;
	private int parkingSlot;
	private int noOfVehicle;
	private int count;

	@Override
	public void park(Car car, ParkingLot parkingLot) {

		this.entryGate = parkingLot.getEntryGate();
		this.parkingArea = parkingLot.getParkingArea();
		this.car = car;
		if (entryGate.equals("first")) {
			if (isAvailable()) {
				firstEntryGateParking(parkingLot);
				printReceipt();
			} else {
				System.out.println("Sorry! All Slots are full");
			}

		} else if (entryGate.equals("last") ) {
			if (isAvailable()) {
				lastEntryGateParking(parkingLot);
				printReceipt();
			} else {
				System.out.println("Sorry! All Slots are full");
			}
		} else if (entryGate.equals("middle") ) {
			if (isAvailable()) {
				middleEntryGateParking(parkingLot);
				printReceipt();
			} else {
				System.out.println("Sorry! All Slots are full");
			}
		}
	}

	private boolean isAvailable() {
		for (int i = 0; i < parkingArea.length; i++) {
			if (parkingArea[i] == null) {
				return true;
			}
		}
		return false;
	}

	private void printReceipt() {

		if (count == 0) {
			System.out.println("Slot No.          Registration No          Colour            Entry Time");
			System.out.println("------------------------------------------------------------------------");
			count++;
		}
		Random randomNum = new Random();
		ParkingReceipt dto = new ParkingReceipt(randomNum.nextInt() + "-RECEIPT-" + randomNum.nextInt(),
				car.getRegistrationNumber(), car.getColour(), parkingSlot, Calendar.getInstance().getTime());
		System.out.println(parkingSlot + "                        " + dto.getRegistrationNumber() + "            "
				+ dto.getColour() + "        " + dto.getEntryTime());
	}

	@Override
	public void emptySlot() {
		if (noOfVehicle != parkingArea.length) {
			for (int i = 0; i < parkingArea.length; i++) {
				if (parkingArea[i] == null) {
					System.out.println("Unallocated slot no :" + i);
				}
			}
		}
	}

	private void firstEntryGateParking(ParkingLot parkingLot) {

		for (int i = 0; i < parkingArea.length; i++) {
			if (parkingArea[i] == null) {
				parkingSlot = i;
				parkingArea[i] = car;
				noOfVehicle++;
				break;
			}
		}
	}

	private void lastEntryGateParking(ParkingLot parkingLot) {
		for (int i = parkingArea.length - 1; i >= 0; i--) {
			if (parkingArea[i] == null) {
				parkingSlot = i;
				parkingArea[i] = car;
				noOfVehicle++;
				break;
			}
		}
	}

	private void middleEntryGateParking(ParkingLot parkingLot) {
		int middle = parkingArea.length / 2;
		for (int i = middle - 1, j = middle + 1; (i < middle && i >= 0)
				&& (j > middle && j < parkingArea.length); i--, j++) {
			if (parkingArea[middle] == null) {
				parkingSlot = middle;
				parkingArea[middle] = car;
				noOfVehicle++;
				break;
			}
			if (((middle - i) == (j - middle))) {
				if (parkingArea[i] == null) {
					parkingSlot = i;
					parkingArea[i] = car;
					noOfVehicle++;
					break;
				} else if (parkingArea[j] == null) {
					parkingSlot = j;
					parkingArea[j] = car;
					noOfVehicle++;
					break;
				}

			} else if (((middle - i) > (j - middle)) && (parkingArea[j] == null)) {
				parkingSlot = j;
				parkingArea[j] = car;
				noOfVehicle++;
				break;
			} else if (((middle - i) < (j - middle)) && (parkingArea[i] == null)) {
				parkingSlot = i;
				parkingArea[i] = car;
				noOfVehicle++;
				break;
			}

		}
	}

	@Override
	public void unPark(int[] parkingSlotNumber) {
		for (int i = 0; i < parkingSlotNumber.length; i++) {
			parkingArea[parkingSlotNumber[i]] = null;	
		}
		
	}

}
