package com.org.hackerrank;

import java.util.Scanner;

public class FindDigits {
		//1234
	public static int findDigits(int n) {
		int temp = n;
		int counter = 0;
		while( n != 0) {
			int t = n % 10;
			if(t!= 0 && temp % t == 0) {
				counter++;
			}
			n = n/10;
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(findDigits(n));
		scan.close();
	}

}
