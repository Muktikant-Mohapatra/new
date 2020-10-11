package com.designPattern.AbstractFactoryDesignPattern;

public class StudentFactory extends AbstractFactory {
	@Override
	public Library getLibrary(String library) {
		return null;
	}

	@Override
	public Student getStudent(String name) {

		if (name.equalsIgnoreCase("RAM")) {
			return new Ram();
		} else if (name.equalsIgnoreCase("HARI")) {
			return new Hari();
		}
		return null;
	}
}
