/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.designpatterns.factory.cars;

public class Car {
	public void start() {
		System.out.println("Car started.");
	}
	public void run() {
		System.out.println("Car running.");
	}
	public void stop() {
		System.out.println("Car stopped.");
	}

} //end of class
