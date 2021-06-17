/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;

public class WageEmpData extends EmployeeData{
	
	@Override
	public WageEmp getEmployee() {
		return new WageEmp();
	}
} //end of class
