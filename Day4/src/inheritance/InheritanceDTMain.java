/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		
		//reference of Employee
		System.out.println("*Reference of Employee with Manager object.* \n");
		Employee emply;
		emply = new Manager(005, "Peaky Blinders", 36000, 5000);
		if (emply instanceof Manager) {
			((Manager) emply).display();
			System.out.println();
			System.out.println("*Show Incentive method.*");
			((Manager) emply).showIncentive();
		}
		
		System.out.println();
		
		//reference of WageEmp
		System.out.println("*Reference of Employee with WageEmp object.* \n");
		Employee wageEmply = new WageEmp(006, "Billy Kimber", 8, 100);
		if(wageEmply instanceof WageEmp) {
			((WageEmp) wageEmply).display();
			System.out.println("*Calculate Wage method.*");
			((WageEmp) wageEmply).calculateWage();
		}
	}
} //end of class
