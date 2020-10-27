package com.org.practice;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String str = "1234685";
		int intValue = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			intValue = intValue * 10 + (int) ch - 48;
		}
		System.out.println("int value : " + intValue);

	}

}
