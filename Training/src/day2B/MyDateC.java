/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2B;

public class MyDateC {

	//declaring member data types
	private int day;
	private int month;
	private int year;
	
	//Default Constructor
	MyDateC(){
		day = month = 2;
		year = 2021;
	}
	
	//method to print date
	public void printDate() {
		System.out.println("Date is: "+day+"/"+month+"/"+year);
	}
} //end of class
