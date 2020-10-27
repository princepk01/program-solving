package com.org.company.benchire;
/*
 * 2) Given an array arr of size N and an integer K, 
 * the task is to find the maximum for each and every contiguous subarray of size K.
 */

import java.util.Scanner;

public class MaximumFoEeachAndEveryContiguousSubarray {

	public static void maximumFoEeachAndEveryContiguousSubarray(int arr[], int n, int k) {
		int j, max;

		for (int i = 0; i <= n - k; i++) {
			max = arr[i];
			for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		maximumFoEeachAndEveryContiguousSubarray(arr, arr.length, k);
		scan.close();
	}

}
