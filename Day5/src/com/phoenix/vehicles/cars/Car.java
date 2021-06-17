/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable{
	
	@Override
	public void start() {
		System.out.println("Car is Starting,..");
	}
	
	@Override
	public void stop() {
		System.out.println("Car is Stopping,..");
	}

	@Override
	public void run() {
		System.out.println("Car is Running..");
	}

	@Override
	public void move() {
		System.out.println("Car is Moving..");
	}
} //end of class
