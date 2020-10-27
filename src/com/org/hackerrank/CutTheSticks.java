package com.org.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {
	public static Integer[] cutTheSticks(int[] arr) {

		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int min = arr[i];
				counter = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] != 0) {
						if(arr[j]<min) {
							arr[j] = 0;
							counter++;
						}else {
							arr[j] = arr[j] - min;
							counter++;
						}
					}
				}
				if(counter != 0) {
					list.add(counter);
				}
			}
		
		}
		Integer[] array = list.toArray(new Integer[0]);

		return array;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		Integer[] cutTheSticks = cutTheSticks(arr);
		for(Integer i : cutTheSticks) {
			System.out.println(i);
		}
		scan.close();

	}

}
