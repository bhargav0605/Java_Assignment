/*
 *Author: Bhargav Parmar
 *Email: bhargav.parmar@stltech.in
 *Copyright: Sterlite Technology Ltd.
 *Version: 1.0.0
 *Date: 10/06/2021
 */

package inheritance.emp.mgr;

import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData{
	
	@Override
	public Manager getEmployee() {
		return new Manager();
	}
}
