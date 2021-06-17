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

public class InheritanceMain extends Employee{

	public static void main(String[] args) {
		
		//Employee Obj parameterized constructor
		System.out.println("Object 1: \n");
		Employee emp = new Employee(002, "Aunt Polly", 50000.00);
//		emp.display();
		System.out.println("Employee parameterized object: \n");
		String empString = emp.toString();
		System.out.println(empString);
		System.out.println("**********************************");
		
		//Manager Obj default constructor
		System.out.println("Object 2: \n");
		Manager mgr = new Manager();
		System.out.println("Manager default object: \n");
		mgr.showIncentive();
		System.out.println();

		mgr.display();
		
		System.out.println();
		
		//toString
		String mgrString = mgr.toString();
		System.out.println(mgrString);
		System.out.println("**********************************");
		
		//Manager object using parameterized constructor
		System.out.println("Object 3: \n");
		System.out.println("Manager parameterized object: \n");
		Manager mgr2 = new Manager(003, "Arthur Shelby", 45000, 2000);
	
		mgr2.showIncentive();
		
		System.out.println();
		
		mgr2.display();
		
		System.out.println();

		String mgr2String = mgr2.toString();
		System.out.println(mgr2String);
		System.out.println("**********************************");
		
		//WageEmp object using default constructor
		System.out.println("Object 4: \n");
		System.out.println("WageEmp default object: \n");
		WageEmp wgemp = new WageEmp();
	
		wgemp.calculateWage();
		
		System.out.println();
	
		wgemp.display();
		
		System.out.println();

		String wgempString = wgemp.toString();
		System.out.println(wgempString);
		System.out.println("**********************************");
		
		//WageEmp object using parameterized constructor
		System.out.println("Object 5: \n");
		System.out.println("WageEmp parameterized object: ");
		WageEmp wgemp2 = new WageEmp(004, "John Shleby", 8, 150);
	
		System.out.println();
		
		wgemp2.display();
		
		System.out.println();

		String wgempString2 = wgemp2.toString();
		System.out.println(wgempString2);	
	}
} //end of class
