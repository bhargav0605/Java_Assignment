/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2D;

public class DateMainP {
	//main method
	public static void main(String[] args) {
		
		//Default constructor
		MyDateP mdp1 = new MyDateP();
		mdp1.printDate();
		
		//Parameterized Constructor
		MyDateP mdp2 = new MyDateP(8, 6, 2021);
		mdp2.printDate();	
	}
}//end of class
