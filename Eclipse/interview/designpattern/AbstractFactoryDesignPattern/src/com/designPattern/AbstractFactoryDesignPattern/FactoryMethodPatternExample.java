package com.designPattern.AbstractFactoryDesignPattern;

public class FactoryMethodPatternExample {

	public static void main(String[] args) {
		AbstractFactory abstractFactory=FactoryCreator.getFactory("LIBRARY");
		Library library=abstractFactory.getLibrary("SUBASH BOSH");
		library.getLibrary();
		
		AbstractFactory abstractFactory2=FactoryCreator.getFactory("STUDENT");
		Student student=abstractFactory2.getStudent("RAM");
		student.getStident();
		System.out.println(library.getLibrary());
		System.out.println(student.getStident());
	}

}
