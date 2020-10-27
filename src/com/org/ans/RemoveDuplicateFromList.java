package com.org.ans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("prince");
		list.add("ankit");
		list.add("prince");
		list.add("rahul");
		list.add("ankit");
		list.add("prince");
		list.add("prince");
		list.add("rahul");
		System.out.println(list);
		
		Map<String,Integer> map1 = new HashMap<String, Integer>();
		Map<String,Integer> map2 = new HashMap<String, Integer>();
		for(String str: list) {
			if(map1.containsKey(str)) {
				map1.put(str, map1.get(str)+1);
			}else {
				map1.put(str, 1);
			}
		}
		

		for(String str: list) {
			
			map2.put(str, map2.get(str) == null ? 1 : map2.get(str)+1);
		}
		System.out.println("map1 : "+map1);
		System.out.println("map2 : "+map2);

	}

}
