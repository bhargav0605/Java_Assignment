/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2;

public class DateMain {
	//main method
	public static void main(String[] args) {
		
		//initializing object one
		MyDate obj1 = new MyDate();
		obj1.initDate(8, 6, 2021);
		obj1.printDate();
		
		//initialization object two
		MyDate obj2 = new MyDate();
		obj2.initDate(9, 6, 2021);
		obj2.printDate();
	}
} //end of class
