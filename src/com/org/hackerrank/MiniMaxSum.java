package com.org.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		long sum1 = 0;
		long sum2 = 0;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				sum1 += arr[i];
			}
			if(i > 0) {
				sum2 += arr[i];
			}
		}
		
		System.out.println(sum1+" "+sum2);
		scan.close();
	}

}
