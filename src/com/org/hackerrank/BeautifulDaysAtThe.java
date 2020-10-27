package com.org.hackerrank;

import java.util.Scanner;

public class BeautifulDaysAtThe {

	public static int beautifulDays(int i, int j, int k) {

		int counter = 0;
		while (i <= j) {
			int reverseNumber = reverseNumber(i);
			int diff = Math.abs(i-reverseNumber);
			if(diff % k == 0) {
				counter++;
			}
			i++;
		}
		return counter;
	}

	public static int reverseNumber(int n) {
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(beautifulDays(i, j, k));
		scan.close();
	}

}
