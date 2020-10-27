package com.org.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {

	public static void main(String[] args) {
		int arr[] = {3,2,2,3};
		int val = 3;
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(val)) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list.size());
	}

}
