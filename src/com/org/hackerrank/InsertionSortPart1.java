package com.org.hackerrank;

import java.util.Scanner;

public class InsertionSortPart1 {

	public static void insertionSort1(int n, int[] arr) {
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			for (int k = 0; k < n; k++) {
				System.out.print(arr[k]+" ");
			}
			arr[j + 1] = key;
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		insertionSort1(n, arr);
		scan.close();

	}

}
