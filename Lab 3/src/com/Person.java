package com;

import java.time.LocalDate;

public class Person {
	
	private String firstName, lastName;
	private LocalDate dob;
	private long age;
	private char gender;
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	
	public Person() {
		super();
	}
	public Person(String firstName, String lastName, LocalDate dob, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}
	
	public void displayPersonDetails(String fullName) {
		System.out.println("Person Details:");
		System.out.println("____________");
		System.out.println();
		System.out.println("Full Name: "+fullName);
		System.out.println("Gender: "+gender);
		System.out.println("D.O.B.: "+dob);
		System.out.println("Age: "+age);
	}
}
