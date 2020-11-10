package com.lab6_1;

public class Person {
	
	private String firstName, lastName;
	private char gender;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws NameException {
		if (firstName.length()==0)
			throw new NameException("First Name can't be blank.");
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws NameException {
		if (lastName.length()==0)
			throw new NameException("Last Name can't be blank.");
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName, char gender) throws NameException {
		super();
		if (firstName.length()==0)
			throw new NameException("First Name can't be blank.");
		this.firstName = firstName;
		if (lastName.length()==0)
			throw new NameException("Last Name can't be blank.");
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void displayPersonDetails() {
		System.out.println("Person Details:");
		System.out.println("____________");
		System.out.println();
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Gender: "+gender);
	}
}
