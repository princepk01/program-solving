package com.org.ds.stack;

import java.util.Scanner;

public class CheckingBalancingSymbols {

	int MAX = 100;
	char stack[] = new char[MAX];
	int top = -1;

	public void push(char symbol) {

		stack[++top] = symbol;
	}

	public char pop() {
		char element = '0';
		if (top != -1) {
			element = stack[top--];
		}
		return element;

	}

	public static void main(String[] args) {
		CheckingBalancingSymbols c = new CheckingBalancingSymbols();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				c.push(ch);
				continue;

			}
			switch (ch) {
			case ')': {
				char popChar = c.pop();
				if (popChar == '(') {
					flag = true;
				}
			}
				break;
			case '}': {
				char popChar = c.pop();
				if (popChar == '{') {
					flag = true;
				}
			}
				break;
			case ']': {
				char popChar = c.pop();
				if (popChar == '[') {
					flag = true;
				}
			}
				break;
			}
		}

		if (flag && c.top == -1) {
			System.out.println("Balanced symbol");
		} else {
			System.out.println("Balanced not symbol");
		}
		scan.close();
	}
}
