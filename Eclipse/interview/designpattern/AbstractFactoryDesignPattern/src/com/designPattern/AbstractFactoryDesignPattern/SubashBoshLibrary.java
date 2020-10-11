package com.designPattern.AbstractFactoryDesignPattern;

public class SubashBoshLibrary implements Library{
	@Override
	public String getLibrary() {
		return new String("Subash Bosh Library");
	}
}
