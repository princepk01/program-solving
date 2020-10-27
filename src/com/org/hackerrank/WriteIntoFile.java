package com.org.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("out.txt");
		BufferedReader bufr = new BufferedReader(fr);
		int count = 1;
		String line = bufr.readLine();
		System.out.println("Old way of reading file line by line in Java : ");
		while (line != null) {
			System.out.println(count + " : " + line);
			line = bufr.readLine();
			count++;
		}
		bufr.close();

	}

}
