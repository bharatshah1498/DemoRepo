package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("Numbers.txt"));
		
		String numberLine = scanner.nextLine();
		String numbers[] = numberLine.split(",");
		
		for (String n : numbers) {
			int number = Integer.parseInt(n);
			if (number%2 == 0) {
				System.out.println(number);
			}
		}
		
		scanner.close();
	}

}
