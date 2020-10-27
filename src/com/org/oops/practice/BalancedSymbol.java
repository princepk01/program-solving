package com.org.oops.practice;

import java.util.Stack;

public class BalancedSymbol {
	static boolean areParanthesisBalanced(String expr) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;

			switch (x) {
			case ')':
				stack.pop();
				if (x == '{' || x == '[')
					return false;
				break;

			case '}':
				stack.pop();
				if (x == '(' || x == '[')
					return false;
				break;

			case ']':
				stack.pop();
				if (x == '(' || x == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		//String expr = "([{}])";  
		String expr =  "(]";
        if (areParanthesisBalanced(expr)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
	}

}
