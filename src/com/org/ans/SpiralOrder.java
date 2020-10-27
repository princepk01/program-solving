package com.org.ans;

import java.util.Scanner;

public class SpiralOrder {

	public static void sprialOrder(String str) {
		/*
		 * char[] charArray = str.toCharArray(); Arrays.sort(charArray);
		 */
		//a,b,c,d,e,f,g,h,i,j
		/*
		 * a 
		 * bc 
		 * fed 
		 * ghij
		 */
		
		int j=1;
		for(int i=1; i<str.length();i++) {
			if(i%2 != 0) {
				System.out.println(str.substring(j, i+j));
			}else {
				System.out.println(str.substring(j, i+j));
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		sprialOrder(str);
		scan.close();

	}

}
