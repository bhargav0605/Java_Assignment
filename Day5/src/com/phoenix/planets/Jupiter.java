/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.planets;

public class Jupiter extends Planet{

	@Override
	public void move() {
		System.out.println("Jupiter Moving..");
		
	}

	@Override
	public void rotate() {
		System.out.println("Jupiter Rotating..");		
	}

	@Override
	public void revolve() {
		System.out.println("Jupiter Revolving..");
		
	}

	@Override
	public boolean supportsLife() {
		return false;
	}
}
