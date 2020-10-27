package com.org.hackerrank;

import java.util.Scanner;

public class PangramsString {
	public static void pangrams(String s) {
		String tempString = s.toUpperCase();
		boolean flag = false;
		for(int i=65; i<=90;i++) {
			String cs = Character.toString((char)i);
			if(tempString.contains(cs)) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("pangram");
		}else {
			System.out.println("not pangram");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		pangrams(str);
		scan.close();

	}

}
