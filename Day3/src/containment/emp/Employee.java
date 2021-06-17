/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package containment.emp;

import containment.date.MyDate;

public class Employee {
	
	private int empId;
	private String name;
	private MyDate birthDate;
	
	public Employee(){}
	
	public Employee(int empId, String name, MyDate birthDate){
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;	
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void display() {
		System.out.println("Employee [empId=" + empId + ", name=" + name + ", birthDate=" + birthDate + "]");
	}

	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
} //end of class
