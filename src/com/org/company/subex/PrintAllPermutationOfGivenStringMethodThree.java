package com.org.company.subex;

import java.util.Scanner;

public class PrintAllPermutationOfGivenStringMethodThree {

	public static void printPermutation(String str, String result) {

		if (str == null || str.isEmpty()) {
			System.out.print(result + " ");
			return;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				String res = str.substring(0, i) + str.substring(i + 1);
				printPermutation(res, result + ch);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printPermutation(str, "");
		scan.close();
	}

}
