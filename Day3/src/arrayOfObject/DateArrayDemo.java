/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package arrayOfObject;


public class DateArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("MyDate objects: ");
		MyDate arrDate[] = new MyDate[3];
		
		arrDate[0] = new MyDate(6,5,1999); 
		arrDate[1] = new MyDate(9,5,1999); 
		arrDate[2] = new MyDate(11,5,1999); 
		
//		arrDate[0].printDate();				debug
		
		//traditional for loop
		for(int i=0;i<arrDate.length;i++) {
			arrDate[i].printDate();
		}
		System.out.println();

		//For-each loop
		System.out.println("MyDate objects with for each loop: ");
		
		MyDate[] arrDate1 = { new MyDate(1,1,2021), 
							new MyDate(2,1,2021),
							new MyDate(3,1,2021)};
		
		//for each loop
		for(MyDate d:arrDate1) {
			d.printDate();
		}
	} //end of main
} //end of class
