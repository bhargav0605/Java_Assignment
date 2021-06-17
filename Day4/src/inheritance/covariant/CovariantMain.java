/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package inheritance.covariant;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Using EmployeeData**");
		EmployeeData empd = new EmployeeData();
		empd.getEmployee();
		Employee e = empd.getEmployee();
		System.out.println(e.toString());
		System.out.println();
		
		//Manager
		System.out.println("**Using ManagerData**");
		ManagerData mgrd = new ManagerData();
		mgrd.getEmployee();
		Manager m = mgrd.getEmployee();
		System.out.println(m.toString());
		System.out.println();
		
		//WageEmp
		System.out.println("**Using WageEmpData**");
		WageEmpData wgempd = new WageEmpData();
		wgempd.getEmployee();
		WageEmp we = wgempd.getEmployee();
		System.out.println(we.toString());
		System.out.println();
		we.calculateWage();
	}
} //end of class
