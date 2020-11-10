package com.cg.eis.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService {
	
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public EmployeeServiceImpl() {
		super();
	}
	public EmployeeServiceImpl(Employee emp) {
		super();
		this.emp = emp;
	}
	
	@Override
	public void setEmployeeDetails() {
		Scanner sc = new Scanner (System.in);
		
		try {
			emp = new Employee();
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
		} catch (EmployeeException e) {
			emp = null;
			System.out.println(e);
		}
		
		sc.close();
	}

	@Override
	public char setInsuranceScheme() {

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
	public void displayEmployeeDetail() {
		
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
	
	public boolean addToFile () {
		
		boolean check = false;
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("EmployeeData.txt",true));
			bw.write(emp.toString());
			bw.newLine();
			check = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
	
	public void readFromFile () {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("EmployeeData.txt"));
			String line = br.readLine();
			while (line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
