/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee{
	
	private double incentive;
	
	public Manager() {
		incentive = 1000;
	}
	
	public Manager(int empId, String name, double salary, double incentive) {
		super(empId, name, salary);
		this.incentive = incentive;
	}
	
	public void showIncentive() {
		System.out.println("Incentive: "+incentive);
	}
	
	public void display() {
		super.display();
		System.out.println("Incentive: "+incentive);
	}
	
	public String toString() {
		String ss = super.toString();
		return ss+" "+"\n"+
				"Incentive: "+incentive;
	}
} //end of class
