package com.oop.topics.inheritencetestandpolymorphism;

public class Animal {
	
	private int noOfLeg;
	private String color;
	
	
	public Animal(int noOfLeg, String color) {
		this.noOfLeg = noOfLeg;
		this.color = color;
		System.out.println(noOfLeg);
		System.out.println(color);
	}

	public void eat() {
		
		System.out.println("Animal is eating");
	}
	
	public void run() {
		System.out.println("Animal is running");
	}
	
	

}
