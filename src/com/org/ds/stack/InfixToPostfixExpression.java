package com.org.ds.stack;

public class InfixToPostfixExpression {
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

	public static void main(String[] args) {
		 String expression = "A*B-(C+D)+E";
		//String expression = "a+b*c-(d/e+f*g*h)";

		String resultString = "";
		InfixToPostfixExpression test = new InfixToPostfixExpression();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				resultString = resultString + ch;
			} else if (ch != ')') {
				if (top == -1 || test.operatorPeriority(ch) > test.operatorPeriority(test.peek())) {
					test.push(ch);
				} else {
					while (top != -1 && test.operatorPeriority(ch) < test.operatorPeriority(test.peek())
							&& test.peek() != '(') {
						resultString = resultString + test.peek();
						test.pop();
					}
					if (top != -1 && test.operatorPeriority(ch) == test.operatorPeriority(test.peek())
							&& test.peek() != '(') {
						resultString = resultString + test.peek();
						test.pop();
					}
					test.push(ch);
				}
			} else if (ch == ')') {
				while (test.peek() != '(') {
					resultString = resultString + test.pop();
					if (top == -1) {
						System.exit(0);
					}
				}
				test.pop();
			}
		}

		while (top != -1) {
			resultString = resultString + test.pop();
		}
		System.out.println("resultString : " + resultString);
	}

}
