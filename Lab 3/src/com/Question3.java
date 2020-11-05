package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Question3 {

	public void calculateDuration(LocalDate ld) {
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("Duration in Days: "+ChronoUnit.DAYS.between(ld, currentDate));
		System.out.println("Duration in Months: "+ChronoUnit.MONTHS.between(ld, currentDate));
		System.out.println("Duration in Years: "+ChronoUnit.YEARS.between(ld, currentDate));
	}
	
	public static void main(String[] args) {
		
		Question3 q3 = new Question3();
		q3.calculateDuration(LocalDate.of(1998,05,14));

	}

}
