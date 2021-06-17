/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2C;

//Overloading of Methods
public class MathEngine {
	
	//First Method
	public int multiply(int n1, int n2) {
		int n3 = n1 * n2;
		return n3;
	}
	
	//Second Method
	public void multiply(int n1, int n2, int n3) {
		int n4 = n1 * n2 * n3;
		System.out.println("Multipy method with three parameters: " +n4);
	}
	
	//Third Method
	public float multiply(float n1, int n2) {
		float n3 = n1 * n2;
		return n3;
	}
	
	//Fourth Method
	public float multiply(int n1, float n2) {
		float n3 = n1 * n2;
		return n3;
	}
} //end of class
