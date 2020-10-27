package com.org.hackerrank;

import java.util.Scanner;

public class UtopianTree {

	public static int utopianTree(int n) {

		int height = 1;
		int cycle = 1;
		if (n == 0) {
			return height;
		}
		while (cycle <= n) {
			if (cycle % 2 != 0) {
				height *= 2;
			} else {
				height += 1;
			}
			cycle++;
		}
		return height;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(utopianTree(n));
		scan.close();
	}

}
