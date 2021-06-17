/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 2.0.0
 *Date: 10/06/2021
 */
package arrayOfObject;

public class MyDate {
	//declaring member data types
	private int day;
	private int month;
	private int year;
		
	//method to initialize 
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//method to print date
	public void printDate() {
		System.out.println("Date is: "+day+"/"+month+"/"+year);
	}
}
