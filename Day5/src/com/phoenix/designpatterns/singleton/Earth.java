/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.designpatterns.singleton;

public class Earth {
	
	private static Earth obj;
	
	private Earth() {
		System.out.println("Default Earth constructor.");
	}
	
	public static Earth getInstance() {
		if(obj == null) {
			obj = new Earth();
		}
		return obj;
	}
	public void createLife() {
		System.out.println("Earth creates life.");
	}
} //end of class
