package com.org.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CountTriplets {

	public static long countTriplets(List<Long> arr, long r) {
		long counter = 0;
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				for(int k=j+1; k<arr.size();k++) {
					Long l1 = arr.get(i);
					Long l2 = arr.get(j);
					Long l3 = arr.get(k);
					if(l1<l2 && l1<l3 && l2<l3) {
						if(l1*r == l2 && l2*r == l3) {
							counter++;
						}
						
					}
				}
			}
		}
		return counter;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long n = scan.nextLong();
		long r = scan.nextLong();
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextLong());
		}
		long countTriplets = countTriplets(list, r);
		System.out.println(countTriplets);
		scan.close();
	}

}
