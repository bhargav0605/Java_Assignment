/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package array2DInhanced;

public class ForEach2Demo {

	public static void main(String[] args) {
		//2D Array
		System.out.println("2D Array using new keyword: ");
        int[][] arr = new int[2][2]; 
        
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
  
        for(int[] innerArray:arr) {
        	for(int val:innerArray) {
        		System.out.print(val+" ");
        	}
        	System.out.println();
        }
        System.out.println();
        
        //2D array without new keyword
        System.out.println("2D Array without using new keyword: ");
        
        int[][] arr1 = {{1, 2, 7, 8}, {3,4,5,6}}; 
  
        for(int[] innerArr:arr1) {
        	for(int val:innerArr) {
        		System.out.print(val+" ");
        	}
        	System.out.println();
        }
	} //end of main
} //end of class
