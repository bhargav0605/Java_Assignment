/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2F;

//getter and setter class
public class MyDateSG {
	
	//declaring member data types
	private int day;
	private int month;
	private int year;
	
	//Default constructor
	MyDateSG(){
		this(1, 6, 2021);
	}
			
	//Parameterized Constructor
	MyDateSG(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;	
	}
	
	//getter for Day
	public int getDay() {
		return day;
	}
	
	//setter for Year
	public void setDay(int day) {
		this.day = day;
	}
	
	//getter for Day
	public int getMonth() {
		return month;
	}
	
	//setter for Year
	public void setMonth(int month) {
		this.month = month;
	}

	//getter for Day
	public int getYear() {
		return year;
	}

	//setter for Year
	public void setYear(int year) {
		this.year = year;
	}
	
	//method to print date
	public void printDate() {
		System.out.println("Date is: "+day+"/"+month+"/"+year);		
	}
} //end of class
