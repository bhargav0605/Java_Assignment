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

public class RTTIMain {
	
	public static void showEmpInfo(Employee emp) {
		if (emp instanceof Manager) {
			((Manager) emp).display();
			System.out.println();
			System.out.println("*Show Incentive method.*");
			((Manager) emp).showIncentive();
		}
		
		if(emp instanceof WageEmp) {
			System.out.println();
			System.out.println("*Show Calculated Wage method.*");
			((WageEmp) emp).calculateWage();
		}
	} //end of main class

	public static void main(String[] args) {
		//Object of Manager
		Manager mgr = new Manager(7, "John Snow", 50000, 6000);
		showEmpInfo(mgr);
		
		//Object of WageEmp
		WageEmp wgemp = new WageEmp(8, "Tony Stark", 8, 2000);
		showEmpInfo(wgemp);
	}
} //end of class
