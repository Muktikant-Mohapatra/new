package com.designPattern.AbstractFactoryDesignPattern;

public class MadhusudhanLibrary implements Library {
	@Override
	public String getLibrary() {
		return new String("Madhusudhan Library");
	}
}
