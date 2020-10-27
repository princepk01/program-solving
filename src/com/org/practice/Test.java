package com.org.practice;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 2 };
		int k = 4;
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[i] + arr[j];
				if(temp == k && i != j) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		counter = 0;
		int i = 0;
		int j = 0;
		while (true) {
			if(i== arr.length-1) {
				break;
			}
			int temp = arr[i] + arr[j];
			if(temp == k && i!= j) {
				counter++;
			}
			if(j == arr.length-1) {
				i++;
				j = i;
			}
			j++;
		}
		System.out.println(counter);
	}

}
