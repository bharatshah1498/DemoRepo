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
	
	}
}
