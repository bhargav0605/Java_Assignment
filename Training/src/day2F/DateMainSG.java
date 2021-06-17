/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2F;

public class DateMainSG {

	public static void main(String[] args) {
		
		//Default constructor
		MyDateSG mdtsg = new MyDateSG();
		mdtsg.setDay(9);
		mdtsg.setMonth(6);
		mdtsg.setYear(2021);
		
		int d = mdtsg.getDay();
		int m = mdtsg.getMonth();
		int y = mdtsg.getYear();
		
		//using getters
		System.out.println("Using getters in default constructor, the Date is :"+d+"/"+m+"/"+y);
		
		//printDate method 
//		mdtsg.printDate();
		
		//Parameterized Constructor
		MyDateSG mdtsg2 = new MyDateSG(1, 1, 2021);
		int d1 = mdtsg2.getDay();
		int m1 = mdtsg2.getMonth();
		int y1 = mdtsg2.getYear();
		
		System.out.println("Using gettets in parameterized constructor, the Date is: "+d1+"/"+m1+"/"+y1);
	}
}//end of class
