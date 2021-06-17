/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.Animal;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.machines.Robot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;
import com.phoenix.vehicles.Vehicle;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {
	
	public static void main(String args[]) {

		Movable moveAble;
		
		//Earth Object
		System.out.println("****Earth Object****");
		moveAble = new Earth();
		Earth earth = ((Earth) moveAble);
		
		//Moons
		earth.setNoOfMoons(1);
		
		//toString()
		String earthString = earth.toString();
		System.out.println(earthString);
		
		//boolean
		if(earth.supportsLife()) {
			System.out.println("Planet supports life.");
		} else {
			System.out.println("Planet does not supports life.");
		}
		
		
		System.out.println();
		
		System.out.println("****Jupiter Object****");
		moveAble = new Jupiter();
		Jupiter jupiter = ((Jupiter) moveAble);
		
		//Moons
		jupiter.setNoOfMoons(79);
		
		//toString()
		String jupiterString = jupiter.toString();
		System.out.println(jupiterString);
		
		//boolean
		if(jupiter.supportsLife()) {
			System.out.println("Planet supports life.");
		} else {
			System.out.println("Planet does not supports life.");
		}
		
		System.out.println();
		
		System.out.println("****Tiger Object****");
		moveAble = new Tiger();
		Tiger tiger = ((Tiger)moveAble);
		
		//Jump
		tiger.jump();
		
		//Move
		tiger.move();
		
		//Walk
		tiger.walk();
		
		//Run
		tiger.run();
		
		System.out.println();
		
		System.out.println("****Cat Object****");
		moveAble = new Cat();
		Cat cat = ((Cat)moveAble);
		
		//Jump
		cat.jump();
		
		//Move
		cat.move();
		
		//Walk
		cat.walk();
		
		//Run
		cat.run();
		
		System.out.println();
		
		System.out.println("****Car Object****");
		moveAble = new Car();
		Car car = ((Car)moveAble);
		
		//Start
		car.start();
		
		//Stop
		car.stop();
		
		System.out.println();
		
		System.out.println("****Robot Object****");
		moveAble = new Robot();
		Robot rb = ((Robot) moveAble);
		//move
		rb.move();
		
		//process data
		rb.processData();
		
		rb.useArtificialIntelligence();
		
		rb.senseInfo();
		
		System.out.println();
		
		System.out.println("****Human Robot Object****");
		moveAble = new HumanRobot();
		HumanRobot hr = ((HumanRobot)moveAble);
		
		//Jump
		hr.jump();
		
		//Move
		hr.move();
		
		//Walk
		hr.walk();
	}
} //end of class
