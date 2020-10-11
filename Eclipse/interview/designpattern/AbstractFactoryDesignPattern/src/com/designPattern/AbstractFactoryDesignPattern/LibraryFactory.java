package com.designPattern.AbstractFactoryDesignPattern;

public class LibraryFactory extends AbstractFactory {

	@Override
	public Library getLibrary(String name) {

		if (name.equalsIgnoreCase("MADHUSUDHAN")) {
			return new MadhusudhanLibrary();
		} else if (name.equalsIgnoreCase("SUBASH BOSH")) {
			return new SubashBoshLibrary();
		}
		return null;
	}

	@Override
	public Student getStudent(String name) {
		return null;
	}
}
