package com.org.hackerrank;

import java.util.Scanner;

public class HackerRankInAString {

	public static void hackerRankInString(String str) {
		String temp = "hackerrank";
		int j = 0;
		String tempString = "";
		for (int i = 0; i < temp.length(); i++) {
			while (j < str.length()) {
				char c1 = temp.charAt(i);
				char c2 = str.charAt(j);
				if (c1 == c2) {
					tempString = tempString + Character.toString(c2);
					j++;
					break;
				}
				j++;
			}
		}
		if (tempString.equals(temp)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		hackerRankInString(str);
		scan.close();
	}

}
