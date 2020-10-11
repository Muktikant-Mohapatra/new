package com.parking.service;

import com.parking.domain.model.Car;
import com.parking.domain.model.ParkingLot;

public interface ParkingService {

	void park(Car car, ParkingLot parkingLot) ;

	void unPark(int[] parkingSlotNumber) ;

	void emptySlot();
}
