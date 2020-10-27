package com.org.company.subex;

import java.util.Scanner;

public class ArrangeZeroOneInArray {

	public static int[] arrangeZeroOne(int arr[]) {
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				arr[i] = 0;
				counter++;
			}
		}
		int length = arr.length-1;
		while(counter-- != 0) {
			arr[length--] = 1;
		}
		return  arr;
	}
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int result[] = arrangeZeroOne(arr);
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		scan.close();

	}

}
