package com.org.ans;

public class CreateSimpleCalculator {

	public static void main(String[] args) {

		String str = "-(3+(2-1))";
		char[] charArray = str.toCharArray();

		String tempExp = null;
		String tempStr = "";
		for (int i = 0; i < str.length(); i++) {

			getExp(str.charAt(i), tempStr);
		}
	}

	public static char getExp(char ch,String tempStr) {
		char exp = '0';
		switch (ch) {

		case '+':
			exp = '+';
			break;
		case '-':
			tempStr = tempStr + Character.toString(ch);
			
			break;
		case '(':
			exp = '(';
			break;
		case ')':
			exp = ')';
			break;
		}
		return exp;
	}

}
