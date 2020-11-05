package com;

import java.time.LocalDate;

public class Question5 {

	public void prdtWrntyExpryMonth (LocalDate purchaseDate, long months) {
		
		LocalDate prdtWrntyExpryDate = purchaseDate.plusMonths(months);
		System.out.println("Waranty of product expires on: "+prdtWrntyExpryDate);
	}
	
	public void prdtWrntyExpryYear (LocalDate purchaseDate, long years) {
		
		LocalDate prdtWrntyExpryDate = purchaseDate.plusYears(years);
		System.out.println("Waranty of product expires on: "+prdtWrntyExpryDate);
	}
	
	public static void main(String[] args) {
		
		Question5 q5 = new Question5();
		
		LocalDate purchaseDate = LocalDate.of(2016, 10, 18);
		
		q5.prdtWrntyExpryMonth(purchaseDate, 36);
		q5.prdtWrntyExpryYear(purchaseDate, 3);

	}

}
