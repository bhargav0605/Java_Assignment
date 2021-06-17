/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable{

	@Override
	public void jump() {
		System.out.println("Human Robot is Jumping.");
		
	}

	@Override
	public void run() {
		System.out.println("Human Robot is Running.");
		
	}

	@Override
	public void walk() {
		System.out.println("Human Robot is Walking.");
		
	}
	
	@Override
	public void move() {
		System.out.println("Human Robot is moving.");
	}
} //end of class
