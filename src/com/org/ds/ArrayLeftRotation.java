package com.org.ds;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static void arrayLeftRotation(int arr[], int rotate) {
		// 1 2 3 4 5
		while(rotate-- != 0) {
			int temp = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(i == arr.length-1) {
					arr[arr.length-1] = temp;
					break;
				}
				arr[i] = arr[i+1];
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rotate = scan.nextInt();
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		arrayLeftRotation(arr, rotate);
		scan.close();

	}

}
