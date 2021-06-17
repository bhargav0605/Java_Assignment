/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.designpatterns.singleton;

public class Sun {
	
	private static Sun obj;
	public String str;
	
	private Sun() {
		System.out.println("Default constructor sun.");
	}
	
	public static Sun getInstance() {
		if(obj == null) {
			obj = new Sun();
		}
		return obj;
	}
	public void giveLight() {
		System.out.println("Sun provide light.");
	}
} //end of class
