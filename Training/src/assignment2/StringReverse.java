/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package assignment2;

import java.util.Scanner;

public class StringReverse {
	
	static String reverse(String original) {
		String reverse = "";
		int length = original.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		String original;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		original = sc.nextLine();
		String reverse = reverse(original);
		System.out.println(reverse);
		sc.close();

	}

}
