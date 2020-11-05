package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public Employee getEmployeeDetails ();
	public char getInsuranceScheme(Employee emp);
	public void displayEmployeeDetail (Employee emp);
}
