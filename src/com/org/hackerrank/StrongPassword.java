package com.org.hackerrank;

import java.util.Scanner;

public class StrongPassword {

	public static int minimumNumber(String password) {
		int c1, c2, c3, c4, counter;
		c1 = c2 = c3 = c4 = counter = 0;
		for (int i = 65; i <= 90; i++) {
			if (password.contains(Character.toString((char) i))) {
				c1++;
			}
		}
		for (int i = 97; i <= 122; i++) {
			if (password.contains(Character.toString((char) i))) {
				c2++;
			}
		}
		for (int i = 48; i <= 57; i++) {
			if (password.contains(Character.toString((char) i))) {
				c3++;
			}
		}
		String str = "$&+,:;=?@#|'<>.-^*()%!";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (password.contains(Character.toString(ch))) {
				c4++;
			}
		}

		if (c1 == 0) {
			counter++;
		}
		if (c2 == 0) {
			counter++;
		}
		if (c3 == 0) {
			counter++;
		}
		if (c4 == 0) {
			counter++;
		}
		if (password.length() < 6) {
			int l = 6 - password.length();
			counter = counter > l ? counter : l;
		}
		// special_characters = "!@#$%^&*()-+"
		// [$&+,:;=?@#|'<>.-^*()%!]

		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		String password = scan.nextLine();
		int count = minimumNumber(password);
		System.out.println(count);
		scan.close();

	}

}
