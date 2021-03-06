package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;

public class Employee {
	int id;
	String name;
	double salary;
	String designation;
	char insuranceScheme;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
		if (salary < 3000) 
			throw new EmployeeException("Salary can't be less than 3000");
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(char insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, String designation, char insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
}
