package progeamms;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static void armstrong(int number) {
		int checkNum = number;
		int remainder;
		int answer = 0;
		
		while(number > 0) {
			remainder = number % 10;
			answer = answer + (remainder * remainder * remainder);
			number = number / 10;
		}
		
		if(answer == checkNum) {
			System.out.println("Number is Armstrong number.");
		} else {
			System.out.println("Number is not Armstrong number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to check armstrong: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		armstrong(number);

	}

}
