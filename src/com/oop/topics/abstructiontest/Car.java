package com.oop.topics.abstructiontest;

public class Car extends Vehicle {
	
	private String name;
	private String color;
	private String brand;
	private int numberOfWheel;
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color, String brand, int numberOfWheel) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.numberOfWheel = numberOfWheel;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println("The car is moved to left");

	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println("The car is moved to right");

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("The car is started for moving");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The car is stopped");

	}

	@Override
	public void description(String name, String color, String brand, int numberOfWheel) {
		// TODO Auto-generated method stub
		System.out.println("This is a "+ this.numberOfWheel + " wheeler" + this.name);
		System.out.println("The brand name is "+ this.brand);
		System.out.println("The color of the car is"+this.color);

	}

}
