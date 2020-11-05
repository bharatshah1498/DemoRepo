package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Question4 {

	public void calculateDuration(LocalDate ld1, LocalDate ld2) {
		System.out.println("Duration in Days: "+ChronoUnit.DAYS.between(ld1, ld2));
		System.out.println("Duration in Months: "+ChronoUnit.MONTHS.between(ld1, ld2));
		System.out.println("Duration in Years: "+ChronoUnit.YEARS.between(ld1, ld2));
	}
	
	public static void main(String[] args) {
		
		Question4 q4 = new Question4();
		q4.calculateDuration(LocalDate.of(1998,05,14), LocalDate.of(2020, 10, 13));

	}

}
