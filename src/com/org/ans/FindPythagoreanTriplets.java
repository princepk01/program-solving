package com.org.ans;

import java.util.Arrays;


public class FindPythagoreanTriplets {
	public static boolean pythagoreanTriplets(int arr[]) {
		int j = 0; int k = 1;
		while(true) {
			int n1 = arr[j];
			int n2 = arr[k];
			int result = n1*n1 + n2*n2;
			int maxElement = arr[arr.length-1];
			maxElement = maxElement*maxElement;
			if(result == maxElement) {
				return true;
			}
			k++;
			if(k == arr.length-1) {
				j++;
				k = j+1;
			}
			if(j == arr.length-2) {
				break;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		//int arr[] = {3, 4, 11, 5, 13};
		//int arr[] = {7, 4, 24, 6, 25};
		int arr[] = {7, 20, 24, 21, 29};
		Arrays.parallelSort(arr);
		
		boolean flag = pythagoreanTriplets(arr);
		if(flag) {
			System.out.println("This is a PythagoreanTriplets : true");
		}else {
			System.out.println("This is not aPythagoreanTriplets : false");
		}
	}

}
