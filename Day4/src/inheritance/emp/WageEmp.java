/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package inheritance.emp;

public class WageEmp extends Employee{
	
	//declaration of data members
	private int noOfHours;
	private float ratePerHour;
	
	public WageEmp() {
		noOfHours = 8;
		ratePerHour = 200;
		wage = noOfHours * ratePerHour;
	}
	
	public WageEmp(int empId, String name, int noOfHours, float ratePerHour) {
		super(empId, name);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
		wage = noOfHours * ratePerHour;	
	}
	
	double wage;
	public void calculateWage() {
		wage = ratePerHour * noOfHours;
		System.out.println("Calculated wage is: "+wage);
	}
	
	public void display() {
		super.display();
		System.out.println("No of Hours: "+noOfHours+"\n"+
							"Rate Per Hour: "+ratePerHour+"\n"+
							"Calculated Wage per day: "+wage+"\n");
	}
	
	public String toString() {
		String stringWage = super.toString();
		return stringWage + "\n"+
				"No of Hours: "+noOfHours+"\n"+
				"Rate Per Hour: "+ratePerHour+"\n"+
				"Calculated wage per day: "+wage;
	}
}//end of class
