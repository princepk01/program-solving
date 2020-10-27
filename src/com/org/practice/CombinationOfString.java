package com.org.practice;

public class CombinationOfString {
	static StringBuffer sb = new StringBuffer();
	static String str = "abc";
	public static void combinationString(int i) {
		for (i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			System.out.print(sb+" ");
			if(i<str.length()) {
				combinationString(0);
			}
			sb.setLength(sb.length()-1);
		}
	}

	public static void main(String[] args) {
		
		combinationString(0);
	}

}
