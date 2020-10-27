package com.org.hackerrank;

import java.util.Scanner;

public class TimeConversion {
	
	public static void timeConversion(String str) {
		String[] timeArray = str.split(":");
		int hours = Integer.parseInt(timeArray[0]);
		int minutes = Integer.parseInt(timeArray[1]);
		String second = timeArray[2];
		
		if(hours >=1 && hours <= 12) {
			if(second.contains("AM")) {
				if(hours == 12) {
					hours -= 12;
				}
				System.out.format("%02d:%02d:%s",hours, minutes,second.substring(0,2));
			}else if(second.contains("PM")){
				if(hours < 12) {
					hours += 12;
				}
				System.out.format("%02d:%02d:%s",hours, minutes,second.substring(0,2));
			}
		}
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		timeConversion(str);
		scan.close();
	}



}
