package com.org.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("prince");
		list.add("ankit");
		list.add("prince");
		list.add("rajesh");
		list.add("prince");
		list.add("rakesh");
		list.add("topi");
		list.add("gopi");
		list.add("raju");
		list.add("ankit");
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String str : list) {
			map.put(str,map.get(str) == null ? 1 : map.get(str)+1);
		}
		System.out.println("String count : "+map);
		System.out.println("remove duplicate : "+map.keySet());

	}

}
