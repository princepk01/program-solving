package com.org.hackerrank;

import java.util.Scanner;

public class MinimumAbsoluteDifferencesInArray {
	public static int minimumAbsoluteDifference(int[] arr) {

		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = Math.abs(arr[i] - arr[j]);
				if (min > temp) {
					min = temp;
				} else if (i == 0) {
					min = temp;
				}

			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(minimumAbsoluteDifference(arr));
		scan.close();

	}

}
