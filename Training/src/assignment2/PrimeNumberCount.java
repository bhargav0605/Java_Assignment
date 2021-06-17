package assignment2;

import java.util.Scanner;

public class PrimeNumberCount {
	
	static void primeCount(int number) {
		int count = 0;
		int i;
		System.out.println("First "+number+" prime numbers are: ");
		for(int num=1; count<number; num++) {
			for(i=2; num%i != 0; i++) {
				if(i==num) {
					System.out.println(" "+num);
					count++;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		primeCount(number);

	}

}
