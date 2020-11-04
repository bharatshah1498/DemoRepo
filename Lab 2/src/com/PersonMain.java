package com;

import java.util.Scanner;
import com.Person.Gender;

public class PersonMain {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Person person = new Person ("Divya","Bharathi",20,85.55f,Gender.F);
		System.out.print("Enter the phone number: ");
		person.setPhoneNumber(sc.nextLong());
		System.out.println();
		person.displayPersonDetails();
	}

}
