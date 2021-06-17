/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.planets;

public class Earth extends Planet{

	@Override
	public void move() {
		System.out.println("Moving..");
	}

	@Override
	public void rotate() {
		System.out.println("Rotating..");
	}

	@Override
	public void revolve() {
		System.out.println("Revolving..");
	}

	@Override
	public boolean supportsLife() {
		return true;
	}
}
