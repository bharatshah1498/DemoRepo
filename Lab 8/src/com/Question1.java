package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayDeque;


public class Question1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("My Notes.txt"));
		
		ArrayDeque<String> lines = new ArrayDeque<>();
		String line = br.readLine();
		while(line != null) {
			lines.push(line);
			line = br.readLine();
		}
		
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("My Notes Reversed(line Wise).txt"));
		
		for (String l : lines) {
			bw.write(l);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
		FileReader fr = new FileReader("My Notes.txt");
		
		ArrayDeque<Integer> chars = new ArrayDeque<>();
		int c = fr.read();
		while(c != -1) {
			chars.push(c);
			c = fr.read();
		}
		
		fr.close();

		FileWriter fw = new FileWriter("My Notes Reversed(Character Wise).txt");
		
		for (Integer l : chars) {
			fw.write(l);
		}
		
		fw.flush();
		fw.close();
	}

}
