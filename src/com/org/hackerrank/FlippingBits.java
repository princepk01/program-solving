package com.org.hackerrank;

import java.util.Scanner;

public class FlippingBits {

	public static long flippingBits(long n) {
		int arr[] = new int[32];
		int l = arr.length - 1;
		while (n != 0) {
			arr[l--] = (int) (n % 2);
			n = n / 2;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			} else if (arr[i] == 1) {
				arr[i] = 0;
			}
		}

		int k = 0;
		long number = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			number = number + arr[i] * (long) Math.pow(2, k++);
		}
		return number;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		System.out.println(flippingBits(number));
		scan.close();

	}

}
