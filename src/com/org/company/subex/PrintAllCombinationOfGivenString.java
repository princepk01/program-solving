package com.org.company.subex;

import java.util.Scanner;

public class PrintAllCombinationOfGivenString {

	private StringBuilder output = new StringBuilder();
	private final String inputstring;

	public PrintAllCombinationOfGivenString(final String str) {
		inputstring = str;
		System.out.println("The input string  is  : " + inputstring);
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		PrintAllCombinationOfGivenString combobj = new PrintAllCombinationOfGivenString(str);
		System.out.println("All possible combinations are :  ");
		combobj.findCombinationOfString(0);
		scan.close();
	}

	public void findCombinationOfString(int start) {
		for (int i = start; i < inputstring.length(); i++) {
			output.append(inputstring.charAt(i));
			System.out.print(output + " ");
				findCombinationOfString(i + 1);
			output.setLength(output.length() - 1);
		}
	}

}
