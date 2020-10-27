package com.org.company.subex;

import java.util.Scanner;

public class PrintAllPermutationOfGivenStrngMethodTwo {

	public static void findPermutation(String str, int l, int r) {
		if (l == r) {
			System.out.print(str + " ");
		} else {
			for (int i = l; i <= r; i++) {
				str = swapString(str, l, i);
				findPermutation(str, l + 1, r);
				str = swapString(str, l, i);
			}
		}
	}

	public static String swapString(String str, int i, int j) {
		char[] ch = str.toCharArray();
		char c = ch[i];
		ch[i] = ch[j];
		ch[j] = c;
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		findPermutation(str, 0, str.length() - 1);

		scan.close();
	}

}
