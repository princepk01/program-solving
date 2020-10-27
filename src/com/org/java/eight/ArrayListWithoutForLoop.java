package com.org.java.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListWithoutForLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("prince");
		list.add("rakesh");
		list.add("ankit");
		list.add("lalit");
		list.add("rajesh");
		list.add("shyam");
		list.add("radha");
		list.add("rakhi");
		list.add("tom");
		list.add("jorge");

		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("===========================================");
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("===========================================");
		list.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(list);
	}

}
