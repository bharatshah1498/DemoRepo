package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.*;

public class CheckNumber {
	

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		if (num>=0)
			System.out.println("Given Number is Positive");
		else
			System.out.println("Given Number is Negative");
		
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(1998, 05, 14);

		long years = ChronoUnit.DAYS.between(ld2, ld1);
		System.out.println(years);
	
	}
}
