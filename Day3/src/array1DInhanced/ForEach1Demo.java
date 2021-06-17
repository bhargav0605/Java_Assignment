/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package array1DInhanced;

public class ForEach1Demo {

	public static void main(String[] args) {
		
		//array of double type with for each loop
		System.out.println("Array of type double with for each loop: ");
		double arr[] = new double[5];
		arr[0] = 1.1;
		arr[1] = 11.1;
		arr[2] = 21.5;
		arr[3] = 36;
		arr[4] = 100.1;
		
		for(double a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println();
		
		//float type array without using new keyword
		System.out.println("Array of type float with for each loop: ");
		float arr1[] = {0.1F, 0.05F, 21.5F, 36, 100.1F};
	
		for(float a1 : arr1) {
			System.out.print(a1+" ");
		}
		System.out.println();
		System.out.println();
		
		//Flower name, For each loop
		System.out.println("Array of string type: ");
		String arrS[] = new String[5];
		arrS[0] = "Rose";
		arrS[1] = "Lily";
		arrS[2] = "Tulip";
		arrS[3] = "Orchid";
		arrS[4] = "Carnation";

		
		for(String flower: arrS)
			System.out.print(flower+" ");
		
		System.out.println();
		System.out.println();
		
		//Flower name, For each loop
		System.out.println("Array of Country names: ");
		String arrC[] = new String[5];
		arrC[0] = "India";
		arrC[1] = "USA";
		arrC[2] = "UK";
		arrC[3] = "Germany";
		arrC[4] = "Bahamas";

		
		for(String country:arrC) {
			System.out.print(country+" ");
		}
		
		System.out.println();
		System.out.println();
	}
} //end of class
