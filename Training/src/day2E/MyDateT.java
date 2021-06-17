/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2E;

//this keyword program
public class MyDateT {
	
	//declaring member data types
	private int day;
	private int month;
	private int year;
		
	//Default constructor
	MyDateT(){
		this(1, 6, 2021);
	}
		
	//Parameterized Constructor
	MyDateT(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
		
	//method to print date
	public void printDate() {
		System.out.println("Date is: "+day+"/"+month+"/"+year);
	}
} //end of class
