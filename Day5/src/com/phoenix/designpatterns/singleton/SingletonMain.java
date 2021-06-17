/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 17/06/2021
 */

package com.phoenix.designpatterns.singleton;

public class SingletonMain {
	
	public static void main(String args[]) {
		
		//Sun
		Sun sun = Sun.getInstance();
		sun.giveLight();
		System.out.println("**************");
		
		//Earth
		Earth earth = Earth.getInstance();
		earth.createLife();
		System.out.println("**************");
		
		//PrimeMinister
		PrimeMinister pm = PrimeMinister.getInstance();
		pm.serveNation();
		System.out.println("**************");
		
		//President
		President ps = President.getInstance();
		ps.representNation();
		System.out.println("**************");
	}
} //end of class
