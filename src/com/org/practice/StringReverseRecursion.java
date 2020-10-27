package com.org.practice;

import java.util.Scanner;

public class StringReverseRecursion {

	public static String stringReverse(String str){
		if(str == null || str.isEmpty()){
			return str;
		}
		return str.charAt(str.length()-1) + stringReverse(str.substring(0,str.length()-1));
	}
	
	public static void reverseString(char ch[], int i, int j) {
		if(i<j) {
			char c = ch[i];
			ch[i] =  ch[j];
			ch[j] = c;
			i++;
			j--;
			reverseString(ch,i,j);
		}else {
			System.out.println(ch);
		}
	}
	public static void main(String ar[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//System.out.println(stringReverse(str));
		System.out.println("==================");
		reverseString(str.toCharArray(), 0, str.length()-1);
		scan.close();
	}

}
