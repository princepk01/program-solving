package com.org.hackerrank;

import java.util.Scanner;

public class DayoftheProgrammer {

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeapYear = true;
		}
		return isLeapYear;
	}

	public static String dayOfProgrammer(int year) {

		int totalDay = 0;
		for (int i = 1; i <= 12; i++) {

			switch (i) {
			case 1:
				totalDay += 31;
				break;
			case 2:
				boolean flag = isLeapYear(year);
				if (flag) {
					totalDay += 29;
				} else if(year % 4 == 0){
					if((year / 100)%4 == 0) {
						totalDay += 29;
					}else {
						totalDay += 28;
					}
				}else {
					totalDay += 28;
				}
				break;
			case 3:
				totalDay += 31;
				break;
			case 4:
				totalDay += 30;
				break;
			case 5:
				totalDay += 31;
				break;
			case 6:
				totalDay += 30;
				break;
			case 7:
				totalDay += 31;
				break;
			case 8:
				totalDay += 31;
				break;
			}
		}
		int finalSum = 256 - totalDay;
		String finalDate = finalSum+".09."+year;
		return finalDate;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();

		System.out.println(dayOfProgrammer(year));

		scan.close();

	}

}
