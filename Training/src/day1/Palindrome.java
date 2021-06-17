/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day1;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str) {
		int low = 0;
		int high = str.length() - 1;
		
		while(low < high) {
			if(str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		sc.close();
		boolean ans = checkPalindrome(str);
		
		if(ans) {
			System.out.println("String is Palindrome.");
		} else {
			System.out.println("String is not Palindrome.");
		}

	}

}
