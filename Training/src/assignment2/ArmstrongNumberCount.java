package assignment2;

import java.util.Scanner;

public class ArmstrongNumberCount {
	static void armstrongCount(int number) {
		int copy = 152, remainder, sum, x;
		System.out.println("First "+number+" armstrong numbers are: ");
		while(number != 0) {
			copy++;
			x = copy;
			sum = 0;
			
			while(copy!=0) {
				remainder = copy % 10;
				sum = sum + (remainder * remainder * remainder);
				copy = copy / 10;
			}
			if(sum == x) {
				System.out.print(x+" ");
				number--;
			}
			copy = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		armstrongCount(number);

	}

}
