package com.org.ans;

import java.util.Scanner;

public class TimeInWords {

	public static void timeWord(int hh) {
		switch (hh) {
		case 1:
			System.out.print("one ");
			break;
		case 2:
			System.out.print("two ");
			break;
		case 3:
			System.out.print("three ");
			break;
		case 4:
			System.out.print("four ");
			break;
		case 5:
			System.out.print("five ");
			break;
		case 6:
			System.out.print("six ");
			break;
		case 7:
			System.out.print("seven ");
			break;
		case 8:
			System.out.print("eight ");
			break;
		case 9:
			System.out.print("nine ");
			break;
		case 10:
			System.out.print("ten ");
			break;
		case 11:
			System.out.print("eleven ");
			break;
		case 12:
			System.out.print("twelve ");
			break;
		case 13:
			System.out.print("thirteen ");
			break;
		case 14:
			System.out.print("fourteen ");
			break;
		case 15:
			System.out.print("fifteen ");
			break;
		case 16:
			System.out.print("sixteen ");
			break;
		case 17:
			System.out.print("seventeen ");
			break;
		case 18:
			System.out.print("eighteen ");
			break;
		case 19:
			System.out.print("nineteen ");
			break;
		case 20:
			System.out.print("twenty ");
			break;
		}
	}

	public static void timeText(int mm) {
		if (mm > 20) {
			timeWord(mm / 10 * 10);
			timeWord(mm % 10);
		} else {
			timeWord(mm);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int hh = scan.nextInt();

		if (hh >= 1 && hh <= 12) {
			int mm = scan.nextInt();
			if (mm >= 0 && mm <= 60) {
				if (mm == 0) {
					timeWord(hh);
					System.out.print("o' clock");
				} else if ((mm >= 1 && mm <= 14) || (mm >= 16 && mm <= 29)) {
					timeText(mm);
					if (mm == 1) {
						System.out.print("minute past ");
					} else {
						System.out.print("minutes past ");
					}
					timeWord(hh);
				} else if (mm == 15) {
					System.out.print("quarter past ");
					timeWord(hh);
				} else if (mm == 30) {
					System.out.print("half past ");
					timeWord(hh);
				} else if ((mm >= 31 && mm < 45) || (mm > 45 && mm <= 59)) {
					timeText(60 - mm);
					if (60 - mm == 1) {
						System.out.print("minute to ");
					} else {
						System.out.print("minutes to ");
					}
					if (hh == 12) {
						timeWord(1);
					} else {
						timeWord(hh + 1);
					}
				} else if (mm == 45) {
					System.out.print("quarter to ");
					timeWord(hh + 1);
				}
			}
		}
		scan.close();

	}

}
