package assignment2;

import java.util.Scanner;

public class MultiplicationTable {
	static void mulTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d \n", number, i, number * i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		mulTable(number);

	}

}
