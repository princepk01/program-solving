package com.org.hackerrank;

import java.util.Scanner;

public class PlusMinus {

	public static void plusMinus(int arr[]) {
		int positive = 0;
		int negative = 0;
		int zero=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >=1 ) {
				positive++;
			}else if(arr[i]<0) {
				negative++; 
			}else if(arr[i] == 0) {
				zero++;
			}
		}
		System.out.format("%f",(float)positive/arr.length);
		System.out.println();
		System.out.format("%f",(float)negative/arr.length);
		System.out.println();
		System.out.format("%f",(float)zero/arr.length);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		int arr[] = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		plusMinus(arr);
		scan.close();

	}

}
