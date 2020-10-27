package com.org.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridChallenge {
	public static String gridChallenge(String[] grid) {

		for (int i = 0; i < grid.length; i++) {

			grid[i] = Stream.of(grid[i].split("")).sorted().collect(Collectors.joining());
		}
		String finalString = String.join("", grid);
		System.out.println(finalString);
		int i = 0;
		boolean fg = false;
		while (i < grid[0].length()) {
			String temp = "";
			for (int j = i; j < finalString.length(); j += grid[0].length()) {
				temp = temp + finalString.charAt(j) + "";
			}
				boolean f = albhabeticalOrderCheck(temp);
				if (f) {
					fg = f;
				} else {
					fg = f;
					break;
				}
				i++;
			}

		return fg ? "yes" : "NO";
	}

	public static boolean albhabeticalOrderCheck(String str) {

		boolean flag = false;
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == str.charAt(i)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String strArray[] = new String[n];
		for (int i = 0; i < n; i++) {
			strArray[i] = scan.next();
		}
		System.out.println(gridChallenge(strArray));
		scan.close();

	}

}
