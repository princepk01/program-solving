package com.org.ds.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void printArrayElement(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void bubbleSortAscending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printArrayElement(arr);
	}

	public static void bubbleSortDescending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printArrayElement(arr);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int ar[] = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = scan.nextInt();
		}

		bubbleSortAscending(ar);
		System.out.println();
		bubbleSortDescending(ar);
		scan.close();

	}
}
