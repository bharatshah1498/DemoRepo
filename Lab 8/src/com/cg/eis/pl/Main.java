package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EmployeeServiceImpl s = new EmployeeServiceImpl();
		 * 
		 * s.setEmployeeDetails(); System.out.println();
		 * 
		 * if (s.getEmp()==null) System.out.println("No employee found."); else {
		 * System.out.println((s.setInsuranceScheme()!='\u0000')?"Insurance Scheme "+s.
		 * setInsuranceScheme():"No Insurance Scheme"); s.displayEmployeeDetail(); }
		 */
		
		EmployeeServiceImpl s1 = new EmployeeServiceImpl(new Employee(46044410,"Bharat Shah",50000.0,"Manager",'A'));
		if(s1.addToFile())
			System.out.println("Successfully added to File.");
		
		s1.setEmp(new Employee(46044411,"Pranjal",22000.0,"Programmer",'B'));
		if(s1.addToFile())
			System.out.println("Successfully added to File.");
		
		s1.setEmp(new Employee(46044412,"Ajay",18000.0,"System Associate",'C'));
		if(s1.addToFile()) 
			System.out.println("Successfully added to File.");
		
		s1.setEmp(new Employee(46044413,"Rajat Verma",25000.0,"Programmer",'B'));
		if(s1.addToFile()) 
			System.out.println("Successfully added to File.");
		
		s1.setEmp(new Employee(46044414,"Sachin",4500.0,"clerk",'\u0000'));
		if(s1.addToFile()) 
			System.out.println("Successfully added to File.");
		
		s1.readFromFile();
	}

}
