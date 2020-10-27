package com.org.company.benchire;

/* 
 * 1) Given arrival and departure times of all trains that reach a railway station, the task is 
 * to find the minimum number of platforms required for the railway station so that no train waits.
 * We are given two arrays which represent arrival and departure times of trains that stop.
 */
import java.util.Arrays;

public class MinimumNumberOfPlatformsRequired {

	public static int minimumNumberOfPlatformsRequired(int arrivalTime[], int departureTime[]) {
		Arrays.sort(arrivalTime);
		Arrays.sort(departureTime);
		int plat_needed = 1;
		int result = 1;
		int i = 1;
		int j = 0;
		int length = arrivalTime.length;
		while (i < length && j < length) {
			if (arrivalTime[i] <= departureTime[j]) {
				plat_needed++;
				i++;
			} else if (arrivalTime[i] > departureTime[j]) {
				plat_needed--;
				j++;
			}
			if (plat_needed > result)
				result = plat_needed;
		}
		return result;
	}

	public static void main(String[] args) {
		int arrivalTime[] = { 900, 940, 950, 1100, 1500, 1800 };
		int departureTime[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println("Minimum Number of Platform Required = "
				+ minimumNumberOfPlatformsRequired(arrivalTime, departureTime));
	}

}
