package com.oop.topics.constructortest;

public class Constrator {
	private int numberOfTheTopic;
	private String nameOfTheTopic;
	
	
	public Constrator(int numberOfTheTopic, String nameOfTheTopic) {
		this.numberOfTheTopic = numberOfTheTopic;
		this.nameOfTheTopic = nameOfTheTopic;
		System.out.println("Calling from constructor and values are"+this.numberOfTheTopic+" and "+this.nameOfTheTopic);
	}
	public int getNumberOfTheTopic() {
		return numberOfTheTopic;
	}
	public void setNumberOfTheTopic(int numberOfTheTopic) {
		this.numberOfTheTopic = numberOfTheTopic;
	}
	public String getNameOfTheTopic() {
		return nameOfTheTopic;
	}
	public void setNameOfTheTopic(String nameOfTheTopic) {
		this.nameOfTheTopic = nameOfTheTopic;
	}
	

}
