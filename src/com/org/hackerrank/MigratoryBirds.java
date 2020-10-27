package com.org.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {
	public static int migratoryBirds(List<Integer> arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer k : arr) {
			map.put(k, map.get(k) == null ? 1 : map.get(k) + 1);
		}

		int maxValue = 0;
		int key = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer value = entry.getValue();
			if (maxValue < value) {
				maxValue = value;
				key = entry.getKey();
			}
		}
		return key;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Integer arr[] = new Integer[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(migratoryBirds(Arrays.asList(arr)));
		scan.close();

	}

}
