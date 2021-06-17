/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2E;

//this keyword program
public class DateMainT {

	public static void main(String[] args) {
		
		//Default constructor 
		MyDateT mdt1 = new MyDateT();
		mdt1.printDate();
		
		//Parameterized Constructor
		MyDateT mdt2 = new MyDateT(9, 6, 2021);
		mdt2.printDate();
		
	}

} //end of class
