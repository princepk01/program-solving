package com.org.ans;

import java.util.Scanner;

public class ReverseStringRecursion {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String reverseString = reverseString(str);
		System.out.println("reverseString : "+reverseString);
		scan.close();

	}

	public static String reverseString(String str) {
		
		if(str == null || str.isEmpty()) {
			return str;
		}else {
			return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
		}
		
	}

}
