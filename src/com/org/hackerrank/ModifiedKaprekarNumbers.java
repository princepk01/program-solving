package com.org.hackerrank;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
	static void kaprekarNumbers(int p, int q) {

		while (p <= q) {

			long squareValue = p * p;
			int sumValue = sumDigits(squareValue);
			if (p == sumValue) {
				System.out.print(p + " ");
			}
			p++;
		}

	}

	public static int sumDigits(long squareValue) {
		int sum = 0;
		while (squareValue != 0) {
			sum = sum + (int) (squareValue % 10);
			squareValue /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int q = scan.nextInt();
		kaprekarNumbers(p, q);

		scan.close();

	}

}
