package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		EmployeeServiceImpl s = new EmployeeServiceImpl();
		
		Employee emp = s.getEmployeeDetails();
		
		System.out.println();
		System.out.println((s.getInsuranceScheme(emp)!='\u0000')?"Insurance Scheme "+s.getInsuranceScheme(emp):"No Insurance Scheme");
		
		s.displayEmployeeDetail(emp);
		
	}

}
