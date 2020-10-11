package com.designPattern.AbstractFactoryDesignPattern;

public abstract class AbstractFactory {
  public abstract Library getLibrary(String library);
  public abstract Student getStudent(String name);
}
