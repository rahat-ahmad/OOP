package com.oop.topics.abstructiontest;

abstract class Vehicle {
	 public void moveLeft() {
			// TODO Auto-generated method stub
			System.out.println("The car is moved to left");

		}

		public void moveRight() {
			// TODO Auto-generated method stub
			System.out.println("The car is moved to right");

		}

		public void start() {
			// TODO Auto-generated method stub
			System.out.println("The car is started for moving");

		}

		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("The car is stopped");

		}
	abstract void description(String name,String color, String brand, int numberOfWheel);
}
 
