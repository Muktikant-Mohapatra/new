package com.parking.main;

import java.util.Scanner;

import com.parking.domain.model.Car;
import com.parking.domain.model.ParkingLot;
import com.parking.service.CarParkingService;
import com.parking.service.ParkingService;

public class Parking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Enter Parking lot Size(In Number):"); String size =
		 * scanner.nextLine();
		 * System.out.println("Enter entry gate side (first,last,middle):"); String
		 * entryGate = scanner.nextLine();
		 */
		ParkingLot parkingArea = new ParkingLot(10,"middle");
		ParkingService service = new CarParkingService();
		choiceExecuion(scanner, parkingArea, service);
		service.emptySlot();

	}

	private static void choiceExecuion(Scanner scanner, ParkingLot parkingArea, ParkingService service) {
		String choice = createChoice(scanner);
		switch (choice) {
		case "1":
			System.out.println(" how many cars(In Number):");
			String noOfCars = scanner.nextLine();
			Car[] car = new Car[Integer.parseInt(noOfCars)];
			for (int i = 0; i < car.length; i++) {
				System.out.println(i + ": Car Registration Number:");
				String registrationNumber = scanner.nextLine();
				System.out.println(i + ": Car Colour:");
				String colour = scanner.nextLine();
				car[i] = new Car(registrationNumber, colour);
			}
			for (int i = 0; i < car.length; i++) {
				service.park(car[i], parkingArea);
			}
			createChoice(scanner);
			break;
		case "2":
			System.out.println(" Enter your receipt slot no(if multiple are there separate by (,)):");
			String slotNumbers = scanner.nextLine();
			String[] stringTokens=slotNumbers.split(",");
			int[] slotNumberArray=new int[stringTokens.length];
			for (int i = 0; i < stringTokens.length; i++) {
				slotNumberArray[i]=Integer.parseInt(stringTokens[i]);
			}
			service.unPark(slotNumberArray);
			createChoice(scanner);
			break;
		case "3":
			System.exit(0);
		default:
			System.out.println("Enter a valid option ...");
			break;
		}
	}

	private static String createChoice(Scanner scanner) {
		System.out.println("Choose options (In numbers 1 or 2)");
		System.out.println("1 : Park");
		System.out.println("2 : Leave");
		System.out.println("3 : Exit");
		System.out.println("What you want to do? :");
		String choice=scanner.nextLine();
		return choice;
	}
}
