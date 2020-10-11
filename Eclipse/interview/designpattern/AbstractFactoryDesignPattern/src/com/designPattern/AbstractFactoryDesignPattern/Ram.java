package com.designPattern.AbstractFactoryDesignPattern;

public class Ram implements Student {
	@Override
	public String getStident() {
		return new String("RAM");
	}
}
