package com.org.hackerrank;

import java.util.Scanner;

public class ViralAdvertising {

	public static int viralAdvertising(int n) {

		int liked = 5;
		int comulative = 0;
		while(n-- != 0) {
			comulative = comulative + liked/2;
			liked = liked/2 * 3;
		}
		return comulative;

    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(viralAdvertising(n));
		scan.close();

	}

}
