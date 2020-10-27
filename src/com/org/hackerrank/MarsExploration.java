package com.org.hackerrank;

import java.util.Scanner;

public class MarsExploration {

	public static void marsExploration(String str) {

		String temp = "SOS";
		int i=0;
		int counter = 0;
		System.out.println("str length : "+str.length());
		while(i<str.length()) {
			
			String substring = str.substring(i, i+=3);
			System.out.println("substring : "+substring);
			int j=0;
			while(j<substring.length()) {
				if(temp.charAt(j) != substring.charAt(j)) {
					counter++;
				}
				j++;
			}
			/*
			 * if(!temp.equals(substring)) { counter++; }
			 */
		}
		System.out.println(counter);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		marsExploration(str);
		scan.close();
	}

}
