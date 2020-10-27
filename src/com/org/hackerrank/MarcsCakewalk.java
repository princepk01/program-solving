package com.org.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {

	public static long marcsCakewalk(int[] calorie) {

		long finalResult = 0;
		Arrays.sort(calorie);
		for (int i = 0; i < calorie.length / 2; i++) {
			int temp = calorie[i];
			calorie[i] = calorie[calorie.length - 1 - i];
			calorie[calorie.length - 1 - i] = temp;
		}

		for (int i = 0; i < calorie.length; i++) {
			finalResult = finalResult + calorie[i] * (long) Math.pow(2, i);
		}
		return finalResult;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(marcsCakewalk(arr));
		scan.close();
	}

}
