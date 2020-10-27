package com.org.hackerrank;

import java.util.Scanner;

public class AngryProfessor {

	public static String angryProfessor(int k, int arr[]) {

		String resultString = "YES";
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				counter++;
			}
		}
		if (counter >= k) {
			resultString = "NO";
		}
		return resultString;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(angryProfessor(k, arr));
		scan.close();

	}

}
