/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package containment.main;

import containment.date.*;	
import containment.emp.Employee;

public class ContainmentMain {

	public static void main(String[] args) {
		
		//object of employee 
		Employee emp = new Employee();
		
		//setters
		emp.setEmpId(001);
		emp.setName("Thomas Shelby");
		emp.setBirthDate(new MyDate(8, 7, 1987));
		
		//getters
		int id = emp.getEmpId();
		String name = emp.getName();
		MyDate date = emp.getBirthDate();
		
		//toString 
		String employeeDetails = emp.toString();
		System.out.println(employeeDetails);

		//Object 2
		Employee emp2 = new Employee(002, "John Shelby", new MyDate(7,8,1985));
		emp2.display();
	}

}
