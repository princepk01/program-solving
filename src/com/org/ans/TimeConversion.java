package com.org.ans;

import java.util.Scanner;

public class TimeConversion {
	
	public static void conversion(String str) {
		String[] strArr = str.split(":");

		int hh = Integer.parseInt(strArr[0]);
		int mm = Integer.parseInt(strArr[1]);
		String ss = strArr[2];

		if (hh >= 1 && hh <= 12 && ss.contains("PM")) {
			if (hh == 12) {
				System.out.format("%02d:%02d:%s", hh, mm, ss.substring(0, 2));
			} else {
				System.out.format("%02d:%02d:%s", hh + 12, mm, ss.substring(0, 2));
			}
		} else if (hh >= 1 && hh <= 12 && ss.contains("AM")) {
			if (hh == 12) {
				System.out.format("%02d:%02d:%s", hh-12, mm, ss.substring(0, 2));
			} else {
				System.out.format("%02d:%02d:%s", hh, mm, ss.substring(0, 2));
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		conversion(str);
		scan.close();
	}

}
