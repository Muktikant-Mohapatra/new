package com.designPattern.AbstractFactoryDesignPattern;

public class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("LIBRARY")) {
			return new LibraryFactory();
		} else if (choice.equalsIgnoreCase("STUDENT")) {
			return new StudentFactory();
		}
		return null;
	}
}
