package com.oop.topics.interfacetest;

public class Bus implements Vehicle {
	
	private String name;
	private String color;
	private String brand;
	private int numberOfWheel;
	
	
	

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String name, String color, String brand, int numberOfWheel) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.numberOfWheel = numberOfWheel;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println("The bus is moved to left");

	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println("The bus is moved to right");

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("The bus is started for moving");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The bus is stopped");

	}

	@Override
	public void description(String name, String color, String brand, int numberOfWheel) {
		// TODO Auto-generated method stub
		System.out.println("This is a "+ this.numberOfWheel + " wheeler" + this.name);
		System.out.println("The brand name is "+ this.brand);
		System.out.println("The color of the bus is"+this.color);

	}

}
