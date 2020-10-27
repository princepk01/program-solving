package com.org.hackerrank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AlternatingCharacters {

	public static int alternatingCharacters(String s) {
		int counter = 0;
		List<Character> list = s.codePoints().mapToObj(i -> (char) i).collect(Collectors.toList());

		for (int i = 0; i < list.size() - 1; i++) {
			if ((list.get(i) == 'A' && list.get(i + 1) == 'A') || (list.get(i) == 'B' && list.get(i + 1) == 'B')) {
				list.remove(i);
				i--;
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while (testCase > 0) {
			String str = scan.next();
			System.out.println(alternatingCharacters(str));
			testCase--;
		}
		scan.close();

	}

}
