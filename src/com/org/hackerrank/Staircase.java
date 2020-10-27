package com.org.hackerrank;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for(int i=0;i<n;i++) {
		for(int k=0;k<n-i-1;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("#");
		}
		System.out.println();
	}
	scan.close();
	}

}
