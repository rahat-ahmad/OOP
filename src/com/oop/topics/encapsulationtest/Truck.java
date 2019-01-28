package com.oop.topics.encapsulationtest;

public class Truck {
	
	private String name;
	private int speed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void showResult() {
		
		System.out.println("Showing the result of encapsulation and values are "+this.getSpeed()+" and "+this.getName());
	}

}


