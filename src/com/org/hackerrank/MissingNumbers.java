package com.org.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MissingNumbers {

	/*
	 * public static int[] missingNumbers(int[] arr, int[] brr) { Map<Integer,
	 * Integer> map1 = new HashMap<>(); for (int i = 0; i < arr.length; i++) {
	 * map1.put(arr[i], map1.get(arr[i]) == null ? 1 : map1.get(arr[i]) + 1); }
	 * 
	 * Map<Integer, Integer> map2 = new HashMap<>(); for (int i = 0; i < brr.length;
	 * i++) { map2.put(brr[i], map2.get(brr[i]) == null ? 1 : map2.get(brr[i]) + 1);
	 * }
	 * 
	 * for (Map.Entry<Integer, Integer> entry : map1.entrySet()) { if
	 * (map2.containsKey(entry.getKey())) {
	 * 
	 * } } return 0; }
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}

		int m = scan.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = scan.nextInt();
		}
		//missingNumbers(arr1, arr2);
		scan.close();

	}

}
