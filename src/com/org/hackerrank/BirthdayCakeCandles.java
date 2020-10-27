package com.org.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		
		int counter = 0;
		Arrays.sort(arr);
		int temp = arr[arr.length-1];
		for (int i = arr.length-1; i >=0; i--) {
			if(temp == arr[i]) {
				counter++;
			}
		}
		
		System.out.println(counter);
		scan.close();
	}

}
