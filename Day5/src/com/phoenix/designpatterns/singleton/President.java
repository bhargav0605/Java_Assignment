/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.designpatterns.singleton;

public class President {
	private static President obj;
	
	private President() {
		System.out.println("Default constuctor of president.");
	}
	
	public static President getInstance() {
		if(obj == null) {
			obj = new President();
		}
		return obj;
	}
	
	public void representNation() {
		System.out.println("President represents nation.");
	}
} //end of class
