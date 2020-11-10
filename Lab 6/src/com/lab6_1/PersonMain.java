package com.lab6_1;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person person = null;
		
		try {
			person = new Person ("Divya","Bharathi",'F');
		} catch (NameException e) {
			System.out.println(e);
		}
		
		if (person==null)
			System.out.println("There is no person.");
		else
			person.displayPersonDetails();
		
		sc.close();
	}

}
