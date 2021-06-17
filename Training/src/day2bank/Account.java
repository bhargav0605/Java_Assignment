/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 09/06/2021
 */

package day2bank;

public class Account {
	
	//non static data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYear;
	
	//static members
	private static float interestRate;
	private static int count;
	
	//initialization of static block
	static {
		interestRate = (float) 0.05;
	}
	
	//Default constructor
	Account(){
		count++;
	}
	
	//parameterized constructor
	public Account(int accNo, String ownerName, double balance, float durationYear) {
		super();
		count++;
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYear = durationYear;
	}
	
	//getters and setters for all non static data members
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setDurationYear(float durationYear) {
		this.durationYear = durationYear;
	}
	
	public float getDurationYear() {
		return durationYear;
	}

	//static data member getters and setters
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	
	public static float getInterestRate() {
		return interestRate;
	}
	
	public static int getCount() {
		return count;
	}
	
	//Calculate simple interest
	double amount;
	public void calculateInterest() {
		amount = balance * ( 1 + (interestRate * durationYear));
//		System.out.println("Calculated Interest Rate is: "+amount);
	}
	
	//print details
	public void printDetails() {
		System.out.println("Bank details: ");
		System.out.println("Account Number: "+accNo+"\n"+
							"Owner Name: "+ownerName+"\n"+
							"Balance is: "+balance+"\n"+
							"Interest Rate: "+interestRate+"\n"+
							"Calculated Interest Rate: "+amount+"\n");
		
	}

	public static void noOfAccount() {
		System.out.println("Number of Account present is: "+count);
	}
} //end of class
