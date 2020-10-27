package com.org.ds;

import java.util.Scanner;

public class ReverArrayOfInteger {
	public static int[] reverseArray(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}

		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int[] reverseArray = reverseArray(arr);
		for(int i=0;i<reverseArray.length;i++) {
			System.out.print(reverseArray[i]+" ");
		}
		scan.close();

	}

}
