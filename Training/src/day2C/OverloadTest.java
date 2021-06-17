/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2C;

public class OverloadTest {

	public static void main(String[] args) {
		
		MathEngine me = new MathEngine();
		
		//First Method 
		int n3 = me.multiply(2, 3);
		System.out.println("First multipy method with integer parameter both:"+n3);
		
		//Second Method
		me.multiply(2, 3, 4);
		
		//Third Method
		float n = me.multiply(1.6F, 2);
		System.out.println("Third multiply method with First float parameter: "+n);
		
		//Fourth Method
		float n0 = me.multiply(2, 2.6F);
		System.out.println("Fourth multiply method with second float parameter: " +n0);	
	}
}//end of class
