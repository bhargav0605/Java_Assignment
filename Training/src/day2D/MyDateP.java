/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2D;

public class MyDateP {
	
	//declaring member data types
	private int day;
	private int month;
	private int year;
	
	//Default constructor
	MyDateP(){
		day = month = 1;
		year = 2021;
	}
	
	//Parameterized Constructor
	MyDateP(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	//method to print date
	public void printDate() {
		System.out.println("Date is: "+day+"/"+month+"/"+year);
	}
} //end of class
