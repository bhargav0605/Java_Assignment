/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable{
	
	public void processData() {
		System.out.println("Robot is Processing Data..");
	}
	public void senseInfo() {
		System.out.println("Robot is Sensing Information..");
	}
	public void useArtificialIntelligence() {
		System.out.println("Robot has Artificial Intelligence..");
	}

	@Override
	public void move() {
		System.out.println("Robot is Moving..");
	}
}
