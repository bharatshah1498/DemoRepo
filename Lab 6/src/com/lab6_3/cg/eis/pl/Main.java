package com.lab6_3.cg.eis.pl;
import com.lab6_3.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		EmployeeServiceImpl s = new EmployeeServiceImpl();
		
		s.setEmployeeDetails();
		System.out.println();
		
		if (s.getEmp()==null)
			System.out.println("No employee found.");
		else {
			System.out.println((s.setInsuranceScheme()!='\u0000')?"Insurance Scheme "+s.setInsuranceScheme():"No Insurance Scheme");
			s.displayEmployeeDetail();
		}
		
	}

}
