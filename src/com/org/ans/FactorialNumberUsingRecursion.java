package com.org.ans;

import java.util.Scanner;

public class FactorialNumberUsingRecursion {

	public static int factorialNumberRecursive(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return n*factorialNumberRecursive(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(factorialNumberRecursive(number));
		scan.close();

	}

}
