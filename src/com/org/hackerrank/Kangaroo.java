package com.org.hackerrank;

import java.util.Scanner;

public class Kangaroo {

	public static String kangaroo(int x1, int v1, int x2, int v2) {

		boolean flag = false;
		while (x1 <= x2) {
			x1 = x1 + v1;
			x2 = x2 + v2;
			if (x1 == x2) {
				flag = true;
			}
		}
		if (flag) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();

		System.out.println(kangaroo(x1, v1, x2, v2));
		scan.close();
	}

}
