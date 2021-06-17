/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Cat extends Animal implements Walkable{

	@Override
	public void move() {
		System.out.println("Cat is Moving..");
	}

	@Override
	public void jump() {
		System.out.println("Cat is Jumping..");
		
	}

	@Override
	public void run() {
		System.out.println("Cat is Running..");
		
	}

	@Override
	public void walk() {
		System.out.println("Cat is Walking..");
		
	}
}
