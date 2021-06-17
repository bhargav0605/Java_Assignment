package progeamms;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibo(int count) {
		int n0 = 0, n1 = 1, n2 = 0;
		System.out.print(n0+" "+n1);
		for(int i = 1;i<=count-2;i++) {
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
			System.out.print(" "+n2);
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter count: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
//		System.out.println()
		fibo(number);
	}

}
