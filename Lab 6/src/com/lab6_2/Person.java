package com.lab6_2;

public class Person {

	private String name;
	private float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) throws AgeException {
		if (age<=15) 
			throw new AgeException("Invalid Age!!!");
		this.age = age;
	}
	
	public Person() {
		super();
	}
	public Person(String name, float age) throws AgeException {
		super();
		this.name = name;
		if (age<=15) 
			throw new AgeException("Invalid Age!!!");
		this.age = age;
	}
	
	public String toString() {
		return name+"\t"+age;
	}
}
