package com.org.ans;

public class FindSecondHighestInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 4, 6, 7 };

		int max1 = arr[0];
		int max2 = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max1 <= arr[i]) {
				max2 = max1;
				max1 = arr[i];
			}
		}

		System.out.println("max1 : " + max1);
		System.out.println("max2 : " + max2);
		findSecondLargestNumberInTheArray(arr);
	}

	public static void findSecondLargestNumberInTheArray(int array[]) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {
				secondHighest = highest;
				highest = array[i];
			} else if (array[i] > secondHighest && array[i] != highest)
				secondHighest = array[i];
		}
		System.out.println("secondHighest : " + secondHighest);
	}
}
