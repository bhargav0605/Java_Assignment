/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 */

package day2bank;

public class Bank {
	
	//Display Interest Rate
	public static void main(String[] args) {
		System.out.println("Interest Rate is: "+Account.getInterestRate());
		
		System.out.println();
		
		//Object using default constructor
		Account ac = new Account();
		
		//setting the values
		ac.setAccNo(001);
		ac.setOwnerName("Thomas Shelby");
		ac.setBalance(500000.00);
		ac.setDurationYear(5);
		ac.calculateInterest();
		
		ac.printDetails();
		
		//Space between lines
		System.out.println();
		
		//Object using Parameterized constructor
		Account ac1 = new Account(002, "Arthur Shelby", 5000, 5);
		
		ac1.calculateInterest(); //calculating interest rate
		ac1.printDetails(); //printing details 
		
		//Printing the number of accounts available
		Account.noOfAccount();
	}
} //end of class
