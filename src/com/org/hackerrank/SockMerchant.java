package com.org.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	public static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {
			map.put(ar[i], map.get(ar[i]) == null ? 1 : map.get(ar[i]) + 1);
		}
		System.out.println(map);

		int sum = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer value = entry.getValue();
			sum = sum + value / 2;
		}
		return sum;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(sockMerchant(size, arr));
		scan.close();

	}

}
