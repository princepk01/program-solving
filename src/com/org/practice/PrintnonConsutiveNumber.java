package com.org.practice;

import java.util.ArrayList;

public class PrintnonConsutiveNumber {

	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,5,2,1,1,4,4,3,2};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length-1;i++) {
			int t1 = arr[i];
			int t2  = arr[i+1];
			if(t1 != t2) {
				list.add(t1);
			}
			if(i+1 == arr.length-1) {
				list.add(arr[arr.length-1]);
			}
		}
		System.out.println(list);
		int[] array = list.stream().mapToInt(i->i).toArray();
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
