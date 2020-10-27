package com.org.ans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class FindOccurenceOfElement {
	public static void findOccurrenceOfList(String strArray[]) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String str : strArray) {
		/*	if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}*/
			map.put(str,map.get(str) == null ? 1 : map.get(str)+1);
		}
		System.out.println(map);
		Set<String> keySet = map.keySet();
		System.out.println("keyset : "+keySet);
		
		List<String> list = Arrays.asList(strArray);
		List<String> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
	public static void main(String[] args) {
		String [] strArray = {"aaa","aa","bbb","aa","aaa","bbb","ccc"};
		findOccurrenceOfList(strArray);
	}

}
