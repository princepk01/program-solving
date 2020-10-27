package com.org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static boolean isAnagramString(String s1, String s2) {
		boolean flag = false;
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		boolean flag = isAnagramString(s1, s2);
		if (flag) {
			System.out.println("Both strings are anagram");
		} else {
			System.out.println("Both strings are not anagram");
		}
		scan.close();
	}

}
