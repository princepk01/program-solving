package com.org.company.altimetric;

public class Ladder {

	static int doStuff(String ar[]) {
		return Integer.parseInt(ar[0]);
	}
	public static void main(String[] args) {
		try {
			System.out.println(doStuff(args));
		}catch(Exception e) {
			System.out.println("exe");
		}

	}

}
