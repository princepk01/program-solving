package com.org.ans;

import java.util.Scanner;

public class CamelCase {

	public static int camelCaseCount(String str) {
		char[] charArray = str.toCharArray();
		int wordCounter = 1;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				wordCounter++;
			}
		}
		return wordCounter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		int wordCount = camelCaseCount(str);
		System.out.println(wordCount);
		scan.close();

	}

}
