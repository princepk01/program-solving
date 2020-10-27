package com.org.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedString {

	public static long repeatedString(String s, long n) {
		char tempChar = s.charAt(0);
		int l = s.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			map.put(s.charAt(i), map.get(s.charAt(i)) == null ? 1 : map.get(s.charAt(i))+1);
		}
		int counter  = map.get('a');
		long sum = 0;
		if(l==1) {
			return n;
		}
		while(l <= n) {
			l+=s.length();
			sum = sum + counter;
		}
		if(l>n) {
			int t = l-(int)n;
			int i= 0;
			while(i<t) {
				if(s.charAt(i) == 'a') {
					sum++;
				}
				i++;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		long n = scan.nextLong();
		
		long counter = repeatedString(s, n);
		System.out.println(counter);
		scan.close();

	}

}
