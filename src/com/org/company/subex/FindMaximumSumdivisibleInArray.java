package com.org.company.subex;

import java.util.Scanner;

public class FindMaximumSumdivisibleInArray {

	public static int findMaximumSum(int arr[], int k) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (i != j) {
					sum = sum + arr[j];
				}
			}
			if (sum % k == 0) {
				if (max <= sum) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		int k = scan.nextInt();
		System.out.println(findMaximumSum(arr, k));
		scan.close();
	}

}
