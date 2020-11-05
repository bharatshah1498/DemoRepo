package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Question7 {

	public long calculateAge(LocalDate dob) {
		return ChronoUnit.YEARS.between(dob, LocalDate.now());
	}
	
	public String getFullName(String firstName, String lastName) {
		return firstName+" "+lastName;
	}
	
	public static void main(String[] args) {
		
		Question7 q7 = new Question7();
		Person p1 = new Person("Bharat","Shah",LocalDate.of(1998, 05, 14),'M');
		p1.setAge(q7.calculateAge(p1.getDob()));
		p1.displayPersonDetails(q7.getFullName(p1.getFirstName(), p1.getLastName()));

	}

}
