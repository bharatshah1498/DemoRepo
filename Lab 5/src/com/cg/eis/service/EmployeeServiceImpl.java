package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeDetails() {
		Scanner sc = new Scanner (System.in);
		Employee emp = new Employee();
		System.out.println("Enter Your Details");
		System.out.print("Enter Id: ");
		emp.setId(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Name: ");
		emp.setName(sc.nextLine());
		System.out.print("Enter Salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		System.out.print("Enter Designation: ");
		emp.setDesignation(sc.nextLine());
		
		return emp;
	}

	@Override
	public char getInsuranceScheme(Employee emp) {

		if (emp.getSalary()>=40000 || emp.getDesignation()=="Manager") {
			emp.setInsuranceScheme('A');
			return 'A';
		}
		else if ((emp.getSalary()>=20000 && emp.getSalary()<40000) || emp.getDesignation()=="Programmer") {
			emp.setInsuranceScheme('B');
			return 'B';
		}
		else if ((emp.getSalary()>=5000 && emp.getSalary()<20000) || emp.getDesignation()=="System Associate") {
			emp.setInsuranceScheme('C');
			return 'C';
		}
		else {
			emp.setInsuranceScheme('\u0000');
			return '\u0000';
		}
	}

	@Override
	public void displayEmployeeDetail(Employee emp) {
		
		System.out.println();
		System.out.println("Employee Details: ");
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Designation: "+emp.getDesignation());
		char c = emp.getInsuranceScheme();
		if (c=='\u0000') {
			System.out.println("No Insurance Scheme.");
		}
		else {
			System.out.println("Insurance Scheme "+c);
		}
		
	}

}
