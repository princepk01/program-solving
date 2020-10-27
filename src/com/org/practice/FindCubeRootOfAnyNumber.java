package com.org.practice;

import java.util.Scanner;

public class FindCubeRootOfAnyNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int n = (int)Math.cbrt(number);
		if (number == n * n * n) {
			System.out.println("Number is cubic root : " + number);
		} else {
			System.out.println("number is not cubic root : " + number);
		}
		
		scan.close();
	}

}
