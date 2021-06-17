package progeamms;

import java.util.Scanner;

public class Factorial {
	
	static void fact(int number) {
		int answer = 1;
		if(number > 0) {
			for(int i=1;i<=number;i++) {
				answer = answer * i;
			}
			System.out.println("Factorial of "+number+" is " +answer);
		} else if(number == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("Please enter positive number.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		fact(number);
	}

}
