package com.org.ds.stack;

import java.util.Scanner;

public class StackOperationWithArray {

	int MAX = 100;
	int stack[] = new int[MAX];
	int top = -1;

	public void push(int data) {
		if (top >= MAX - 1) {
			System.out.println("Stack is overflow.");
		} else {
			stack[++top] = data;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is underflow");
		} else {
			int data = stack[top--];
			System.out.println("Element is poped from the stack : " + data);
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is underflow");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
		}
		System.out.println();
	}

	public void reverseStack() {
		for (int i = 0; i <= top / 2; i++) {
			int temp = stack[i];
			stack[i] = stack[top - i];
			stack[top - i] = temp;
		}
		display();
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		StackOperationWithArray s = new StackOperationWithArray();
		while (true) {
			System.out.println("1. PUSH.");
			System.out.println("2. DISPLAY.");
			System.out.println("3. POP.");
			System.out.println("4. REVERSE");
			System.out.println("5. EXIT");
			System.out.println("\nEnter your choice : ");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				System.out.println("How many element you want to push into the stack : ");
				int stackSize = scan.nextInt();
				for (int i = 0; i < stackSize; i++) {
					s.push(scan.nextInt());
				}
				break;
			case 2:
				s.display();
				break;
			case 3:
				s.pop();
				break;
			case 4:
				s.reverseStack();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}

	}

}
