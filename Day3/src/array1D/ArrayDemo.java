/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package array1D;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//array using new keyword
		System.out.println("Array using new keyword: ");
		
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(); //for cleanup 
		System.out.println(); //for cleanup 

		
		//array without using new keyword
		System.out.println("Array without using new keyword: ");
		
		int arr1[] = { 1, 2, 5, 8, 9 };
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		System.out.println();
		System.out.println();

		
		//array string type city name
		System.out.println("Array of string type: ");
		String arrS[] = new String[5];
		arrS[0] = "Ahmedabad";
		arrS[1] = "Gandhinagar";
		arrS[2] = "Mumbai";
		arrS[3] = "Delhi";
		arrS[4] = "Bangalore";
		
		for(int i=0;i<arrS.length;i++) {
			System.out.print(arrS[i]+", ");
		}
		
		System.out.println();
		System.out.println();
		
		//array of string type hobby 
		System.out.println("Array of string type: ");
		String arrH[] = new String[4];
		arrH[0] = "Gaming";
		arrH[1] = "Graphic Design";
		arrH[2] = "Modifying Cars";
		arrH[3] = "Reading";
		
		for(int i=0;i<arrH.length;i++) {
			System.out.print(arrH[i]+", ");
		}
		System.out.println();
	} //end of main
} //end of class
