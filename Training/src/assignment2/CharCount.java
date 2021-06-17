package assignment2;

import java.util.Scanner;

public class CharCount {
	
	static int charCount(String word, char ch) {
		int count = 0;
		for(int i=0;i<word.length(); i++) {
			if(word.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char ch = sc.next().charAt(0);
		int count = charCount(word, ch);
		System.out.println(count);
		sc.close();

	}

}
