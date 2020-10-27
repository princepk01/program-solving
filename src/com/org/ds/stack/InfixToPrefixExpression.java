package com.org.ds.stack;

import java.util.Stack;

public class InfixToPrefixExpression {
	int MAX = 100;
	char stack[] = new char[MAX];
	static int top = -1;

	public void push(char ch) {
		if (top >= MAX - 1) {
			System.out.println("Stack is overflow");
		} else {
			stack[++top] = ch;
		}
	}

	public char pop() {
		if (top == -1) {
			System.out.println("Stack is underflow.");
		} else {
			char data = stack[top--];
			return data;
		}
		return 0;
	}

	public char peek() {
		if (top == -1) {
			System.out.println("Stack is underflow.");
		} else {
			char data = stack[top];
			return data;
		}
		return 0;
	}

	public int operatorPeriority(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '%':
		case '/':
			return 3;
		case '(':
			return 100;
		}
		return 0;
	}


	  
	// Driver code 
	public static void main(String args[]) 
	{ 
	    //String s = "(A-B/C)*(A/K-L)";
		String s = "A*B-(C+d)+E";
	    //System.out.println( infixToPrefix(s)); 
	} 

}
