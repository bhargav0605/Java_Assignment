/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	private static PrimeMinister obj;
	
	private PrimeMinister() {
		System.out.println("Default constructor of Prime Minister.");
	}
	
	public static PrimeMinister getInstance() {
		if(obj == null) {
			obj = new PrimeMinister();
		}
		return obj;
	}	
	
	public void serveNation() {
		System.out.println("Prime Minister serve nation.");
	}
} //end of class
