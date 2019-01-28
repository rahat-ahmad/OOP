package com.oop.topics.interfacetest;

public interface Vehicle {
	abstract void moveLeft();
	abstract void moveRight();
	abstract void start();
	abstract void stop();
	abstract void description(String name,String color, String brand, int numberOfWheel);
}
