/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 2.0.0
 *Date: 10/06/2021
 */

package inheritance.emp;

public class Employee {
	
	//declaration of variable
	private int empId;
	private String name;
	private double salary;
//	private WageEmp wemp;
	
	public Employee(){
		empId = 001;
		name = "Alfie Solomons";
		salary = 40000;
	}
	
	public Employee(int empId, String name){
		this.empId = empId;
		this.name = name;
		salary = 40000;
	}
	
	public Employee(int empId, String name, double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	//Protected Display
	protected void display() {
		System.out.println("All details are from display method: \n");
		System.out.println("Employee Details: \n"+
							"Employee Id: "+empId+"\n"+
							"Employee Name: "+name+"\n"+
							"Employee Salary: "+salary);
	}
	
	//toString
	public String toString() {
		return "All details are from toString method: "+"\n"+
				"Employee Details: \n"+
				"Employee Id: "+empId+"\n"+
				"Employee Name: "+name+"\n"+
				"Employee Salary: "+salary;
	}
} //end of class
