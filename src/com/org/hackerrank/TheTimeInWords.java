package com.org.hackerrank;

import java.util.Scanner;

public class TheTimeInWords {
	public static String wordHours(int hours) {
		String wordHours = "";
		switch (hours) {
		case 1:
			wordHours = "one";
			break;
		case 2:
			wordHours = "two";
			break;
		case 3:
			wordHours = "three";
			break;
		case 4:
			wordHours = "four";
			break;
		case 5:
			wordHours = "five";
			break;
		case 6:
			wordHours = "six";
			break;
		case 7:
			wordHours = "seven";
			break;
		case 8:
			wordHours = "eight";
			break;
		case 9:
			wordHours = "nine";
			break;
		case 10:
			wordHours = "ten";
			break;
		case 11:
			wordHours = "eleven";
			break;
		case 12:
			wordHours = "twelve";
			break;
		case 13:
			wordHours = "thirteen";
			break;
		case 14:
			wordHours = "fourteen";
			break;
		case 15:
			wordHours = "fifteen";
			break;
		case 16:
			wordHours = "sixteen";
			break;
		case 17:
			wordHours = "seventeen";
			break;
		case 18:
			wordHours = "eighteen";
			break;
		case 19:
			wordHours = "nineteen";
			break;
		case 20:
			wordHours = "twenty";
			break;
		}
		return wordHours;
	}

	public static void timeInWords(int hours, int minutes) {
		String time = "";
		if ((minutes >= 0 && minutes <= 14) || (minutes >= 16 && minutes <= 29)) {
			if (minutes == 0) {
				time = wordHours(hours) + " o' clock";
			} else if (minutes == 1) {
				time = wordHours(minutes) + " minute past " + wordHours(hours);
			} else {
				if (minutes > 20) {
					time = wordHours((minutes / 10) * 10) + " " + wordHours(minutes % 10) + " minutes past "
							+ wordHours(hours);
				} else {
					time = wordHours(minutes) + " minutes past " + wordHours(hours);
				}
			}
		} else if (minutes == 15) {
			time = "quarter past " + wordHours(hours);
		} else if (minutes == 30) {
			time = "half past " + wordHours(hours);
		} else if ((minutes >= 31 && minutes <= 44) || (minutes >= 46 && minutes <= 59)) {
			if ((60 - minutes) > 20) {
				time = wordHours(((60 - minutes) / 10) * 10) + " " + wordHours((60 - minutes) % 10) + " minutes to "
						+ wordHours(hours + 1);
			} else {
				time = wordHours(60 - minutes) + " minutes to " + wordHours(hours + 1);
			}
		} else if (minutes == 45) {
			time = "quarter to " + wordHours(hours + 1);
		}
		System.out.println(time);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		int minutes = scan.nextInt();
		timeInWords(hours, minutes);
		scan.close();

	}

}
