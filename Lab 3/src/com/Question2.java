package com;

import java.util.Scanner;

public class Question2 {
	
	public boolean checkPositive(String str) {
		boolean isPositive = true;
		for (int i=0; i<(str.length()-1); i++) {
			if (str.toLowerCase().charAt(i) > str.toLowerCase().charAt(i+1)) {
				isPositive = false;
			}
		}
		return isPositive;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Question2 q2 = new Question2();
		
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		if (q2.checkPositive(str)) {
			System.out.println("String is Positive.");
		}
		else {
			System.out.println("String is not Positive.");
		}
	}

}
