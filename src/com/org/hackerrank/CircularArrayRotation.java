package com.org.hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {

	public static int[] circularArrayRotation(int[] a, int k, int[] queries) {

		while(k--!=0) {
			int temp = a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i] = a[i-1];
			}
			a[0] = temp;
		}
		for(int i=0; i<queries.length;i++) {
			queries[i] = a[queries[i]];
		}
		 return queries;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int query[] = new int[n];
		for (int i = 0; i < q; i++) {
			query[i] = scan.nextInt();
		}
		int a[] =circularArrayRotation(arr, k, query);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		scan.close();

	}

}
