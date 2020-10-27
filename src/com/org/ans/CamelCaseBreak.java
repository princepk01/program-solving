package com.org.ans;

import java.util.Scanner;

public class CamelCaseBreak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();//"HackerEarth"
		String temp="";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				if(i != 0) {
					temp = temp+"_";
				}
				String t = Character.toString(ch[i]).toLowerCase();
				temp = temp+t;
				
			}else {
				temp = temp+Character.toString(ch[i]);
			}
		}
		System.out.println(temp);
		scan.close();

	}

}
