package com.org.practice;

import java.util.Scanner;

public class PanagarmString {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		boolean flag = false;
		for(int i=97; i<=122; i++) {
			char ch = (char)i;
			if(str.contains(Character.toString(ch))) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("String is a Panagram string");
		}else {
			System.out.println("String is not a Panagram string");
		}
		scan.close();

	}

}
