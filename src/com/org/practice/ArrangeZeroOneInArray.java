package com.org.practice;

public class ArrangeZeroOneInArray {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 0, 1, 0, 1, 0, 1, 0 };
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				arr[i] = 1;
				counter++;
			}
		}
		for (int i = 0; i < counter; i++) {

			arr[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

}
