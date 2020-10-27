package com.org.hackerrank;

import java.util.Scanner;

public class Encryption {

	public static String encryption(String s) {

		s = s.replaceAll("\\s", "");
		int length = s.length();
		int square1 = (int) Math.sqrt(length);
		int square2 = 0;
		if(square1*square1 == length) {
			square2 = square1;
		}else if ((square1 * (square1+1)) < length) {
			square2 = square1+1;
		}else {
			square2 = square1+1;
		}
		String resultString = "";
		int sq = 0;
		int index = 0;
		while (sq < square2) {
			index = sq;
			while (index < length) {
				resultString = resultString + Character.toString(s.charAt(index));
				index = index + square2;
			}
			resultString = resultString + " ";
			sq++;
		}
		return resultString;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(encryption(str));
		scan.close();

	}

}
