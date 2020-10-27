package com.org.company.subex;

import java.util.Scanner;

public class ConvertStringToInteger {

	public static int convertStringToInt(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int temp = (int) ch - '0';
			result = result * 10 + temp;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(convertStringToInt(str));
		scan.close();

	}

}
