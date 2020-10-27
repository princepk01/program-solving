package com.org.company.altimetric;

import java.util.LinkedHashMap;

class Fourty extends Thread {
	public void run() {
		System.out.println("run");
	}
}

public class MyClassFourty {

	public static void main(String[] args) {
		Fourty f = new Fourty();
		f.start();
		System.out.println("main");

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);
		map.put(4, 5);
		map.put(5, 6);
		System.out.println(map);
		
		int x = 3 & 5;
		int y = 3 | 5;
		System.out.println(x+" == "+y);
	}

}
