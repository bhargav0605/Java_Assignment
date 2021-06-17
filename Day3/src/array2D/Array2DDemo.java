/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package array2D;

public class Array2DDemo {

	public static void main(String[] args)
    {
		//2D Array
		System.out.println("2D Array using new keyword: ");
        int[][] arr = new int[2][2]; 
        
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
  
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
  
            System.out.println();
        } // end of for loop
        
        System.out.println();
        
        //2D Array without using new keyword
        System.out.println("2D Array without using new keyword: ");
        
        int[][] arr1 = {{1, 2, 7, 8}, {3,4,5,6}}; 
  
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr1[i][j] + " ");
            }
  
            System.out.println();
        } // end of for loop   
    } //end of main
} //end of class
