package com;

import java.util.Scanner;

public class Question1 {
	
	static Scanner sc = new Scanner (System.in);

	private String str;
	private int choice;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	private String addString() {
		String s1 = "";
		s1 = str+str;
		return s1;
	}
	
	private String oddPositionHash() {
		String s1 = "";
		for (int i=0; i<str.length(); i++) {
			if (i%2 == 0) {
				s1 = s1+"#";
			}
			else {
				s1 = s1+str.charAt(i);
			}
		}
		return s1;
	}
	
	private String removeDuplicate() {
		String s1 = "";
		for (int i=0; i<str.length(); i++) {
			boolean duplicate = false;
			for (int j=0; j<s1.length(); j++) {
				if (s1.toLowerCase().charAt(j) == str.toLowerCase().charAt(i)) {
					duplicate = true;
					break;
				}
			}
			if (duplicate == false) {
				s1 = s1+str.charAt(i);
			}
		}
		return s1;
	}
	
	private String oddPositionUpper() {
		String s1 = "";
		for (int i=0; i<str.length(); i++) {
			if (i%2 == 0) {
				s1 = s1+ str.toUpperCase().charAt(i);
			}
			else {
				s1 = s1+str.charAt(i);
			}
		}
		return s1;
	}
	
	public String stringManipulate () {
		String s1="";
		switch (choice) {
		case 1:
			s1 = this.addString();
			break;
		case 2:
			s1 = this.oddPositionHash();
			break;
		case 3:
			s1 = this.removeDuplicate();
			break;
		case 4:
			s1 = this.oddPositionUpper();
			break;
		default:
			s1 = "Invalid Choice";
			break;
		}
		return s1;
	}
	
	public static void main(String[] args) {
		
		Question1 q1 = new Question1();
		
		System.out.print("Enter the String: ");
		q1.setStr(sc.nextLine());
		
		System.out.println("1) Add the String to itself");
		System.out.println("2) Replace odd positions with #");
		System.out.println("3) Remove duplicate characters in the String");
		System.out.println("4) Change odd characters to upper case");
		System.out.print("Enter Choice (1/2/3/4): ");
		q1.setChoice(sc.nextInt());
		
		System.out.println(q1.stringManipulate());	
	}

}
