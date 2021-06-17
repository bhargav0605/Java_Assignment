package progeamms;

import java.util.Scanner;

public class PrimeNumber {
	
	static void prime(int number) {
		int count = 0;
		int num = 2;
		while(count != number) {
			boolean prime = true;
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				count++;
				System.out.print(" "+num);
			}
			num++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number to check: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		prime(number);
	}

}
