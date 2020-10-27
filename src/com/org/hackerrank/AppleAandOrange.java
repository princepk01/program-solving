package com.org.hackerrank;

import java.util.Scanner;

public class AppleAandOrange {
	public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		for (int i = 0; i < apples.length; i++) {
			apples[i] += a;
		}
		for (int i = 0; i < oranges.length; i++) {
			oranges[i] += b;
		}
		int appleCounter = 0;
		for (int apple : apples) {
			if (apple >= s && apple <= t) {
				appleCounter++;
			} else if (apple >= t && apple <= s) {
				appleCounter++;
			}
		}
		int orangeCounter = 0;
		for (int orange : oranges) {
			if (orange >= s && orange <= t) {
				orangeCounter++;
			} else if (orange >= t && orange <= s) {
				orangeCounter++;
			}
		}

		System.out.println(appleCounter);
		System.out.println(orangeCounter);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int t = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();
		int n = scan.nextInt();
		int apples[] = new int[m];
		int oranges[] = new int[n];
		for (int i = 0; i < m; i++) {
			apples[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			oranges[i] = scan.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apples, oranges);
		scan.close();

	}

}
