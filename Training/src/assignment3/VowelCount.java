/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package assignment3;

import java.util.Scanner;

public class VowelCount {
	public static int countVowel(String sentence) {
		int count = 0;
		for(int i=0;i<sentence.length();i++) {
			char ch = sentence.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String sentence = sc.nextLine();
		int count = countVowel(sentence);
		System.out.println(count);
		sc.close();
	}

}
