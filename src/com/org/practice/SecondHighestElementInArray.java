package com.org.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondHighestElementInArray {

	public static int findSecondHighestElementInArray(int arr[]) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
		}
		System.out.println("max1 value : " + max1 + "    " + "max2 value : " + max2);
		return max2;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int max2Value = findSecondHighestElementInArray(arr);
		System.out.println("max2 value : " + max2Value);
		scan.close();
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//List<Integer> asList = Arrays.asList(arr);
		System.out.println(collect);
	}

}
