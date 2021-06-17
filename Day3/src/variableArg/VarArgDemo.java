/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package variableArg;

public class VarArgDemo {
	
	public static double average(int...a) {
		double avg;
		double sum = 0;
		for(int a1:a) {
//			System.out.println(a1);
			sum = sum + a1;
		}
		avg = sum / (a.length);
			
		return avg;
	}

	public static void main(String[] args) {
		double avg = average(2,2,3);
		System.out.println("Average is: "+avg);
	}//end of main class
} //end of class
