package com.oop.main;

import java.util.Scanner;

import com.oop.topics.abstructiontest.Car;
import com.oop.topics.constructortest.Constrator;
import com.oop.topics.encapsulationtest.Truck;
import com.oop.topics.inheritencetestandpolymorphism.Dog;
import com.oop.topics.interfacetest.Bus;

public class OopTopics {
	public void constructor() {
		Constrator constractor = new Constrator(1, "Constructor");
		
	}
	
	public void inheritence() {
		Dog dog = new Dog(4, "White");
		System.out.println("Example of overloading");
		dog.run(20);
	}
	
	public void polymorphism() {
		Dog dog = new Dog(4, "White");
		System.out.println("Example of overridding");
		dog.eat();
	}
	
	public void abstraction() {
		Car car = new Car();
		System.out.println("Example of abstraction");
		car.description("F Premio", "Red", "Toyota", 4);
	}
	
	public void interfaceTest() {
		Bus bus = new Bus();
		bus.moveLeft();
		bus.moveRight();
		bus.description("Mini bus", "White", "Hyundai", 6);
		
	}
	
	public void encapsulationTest() {
	   Truck truck = new Truck();
	   truck.setName("Mini Truck");
	   truck.setSpeed(80);
	   truck.showResult();
		
	}
	
	/*
	 * public void interfaceTest() { Bus
	 * System.out.println("Example of abstraction"); car.description("F Premio",
	 * "Red", "Toyota", 4);; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopTopics oopTopics = new OopTopics();
		String number;
		int flag = 1;
		/* Scanner sc = new Scanner(System.in); */
		
		
		while(flag==1) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Press 1 to see the result of constructor");
			System.out.println("Press 2 to see the result of inheritence");
			System.out.println("Press 3 to see the result of polymorphism");
			System.out.println("Press 4 to see the result of abstuction");
			System.out.println("Press 5 to see the result of interface");
			System.out.println("Press 6 to see the result of encapsulation");
			
			
			number = sc.nextLine();
			
			
			switch(number){  
		    //Case statements  
		    case "1": oopTopics.constructor();  
		    break;  
		    case "2": oopTopics.inheritence();  
		    break;  
		    case "3": oopTopics.polymorphism();  
		    break;
		    case "4": oopTopics.abstraction();  
		    break;  
		    case "5": oopTopics.interfaceTest();  
		    break;  
		    case "6": oopTopics.encapsulationTest();  
		    break;
		    //Default case statement  
		    default: 
		    }
			System.out.println();
			System.out.println("Do you want to see this again?? Press 1 to see again and press 2 to exit.");
			flag = sc.nextInt();
			
		}
		
		//sc.close();
		

	}

}
