package com.org.ans;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((o1, o2) -> o1 < o2 ? 1 : o1 > o2 ? -1 : 0);
		t.add(10);
		t.add(20);
		t.add(50);
		t.add(10);
		t.add(30);

		System.out.println(t);

		// Collections.sort(t,(o1,o2)->o1<o2?1:o1>o2?-1:0);
		t.forEach(System.out::println);
		System.out.println("=====================");
		t.stream().filter((p)->p%4==0).forEach(System.out::println);
		List<Integer> collect = t.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
