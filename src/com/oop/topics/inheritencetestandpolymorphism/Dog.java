package com.oop.topics.inheritencetestandpolymorphism;

public class Dog extends Animal{
	public Dog(int noOfLeg, String color) {
		super(noOfLeg, color);
	}
	
	public void eat() {
		//overridding
		System.out.println("Dog is eating");
	}
	
	public void run() {
		//overridding
		System.out.println("Dog is running");
	}
	
	public void run(int speed) {
		System.out.println("The speed is "+speed);
	}
	
}
