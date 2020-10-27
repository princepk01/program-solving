package com.org.hackerrank;

import java.util.Scanner;

public class LibraryFine {
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		int result = 0;
		if (y1 == y2) {
			if (m1 == m2) {
				if (d1 > d2) {
					result = 15 * (d1 - d2);
				}
			} else if (m1 > m2) {
				result = 500 * (m1 - m2);
			}
		} else if (y1 > y2) {
			result = 10000 * (y1 - y2);
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int d1 = scan.nextInt();
		int m1 = scan.nextInt();
		int y1 = scan.nextInt();

		int d2 = scan.nextInt();
		int m2 = scan.nextInt();
		int y2 = scan.nextInt();

		int result = libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(result);
		scan.close();
	}

}
