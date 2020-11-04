package com;

public class Person {
	
	enum Gender{
		M,F
	};

	private String firstName, lastName;
	private int age;
	private float weight;
	private long phoneNumber;
	private Gender gender;
	
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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Person() {
		super();
	}
		
	public Person(String firstName, String lastName, int age, float weight, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	public void displayPersonDetails() {
		System.out.println("Person Details:");
		System.out.println("____________");
		System.out.println();
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
		System.out.println("Phone Number: "+phoneNumber);
	}

}
