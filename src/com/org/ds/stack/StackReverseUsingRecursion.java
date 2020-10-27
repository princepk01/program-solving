package com.org.ds.stack;

public class StackReverseUsingRecursion {

	int MAX = 100;
	int stack[] = new int[MAX];
	int top = -1;

	public void push(int element) {
		if (top >= MAX - 1) {
			System.out.println("Stack is overflow.");
		} else {
			stack[++top] = element;
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is underflow.");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
		}
		System.out.println();
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is underflow.");
		} else {
			int element = stack[top--];
			System.out.println("Element is poped from the stack : " + element);
		}
	}

	int i = 0;

	public void displayUsingRecursion() {
		if (i <= top) {
			int element = stack[i++];
			System.out.print(element + " ");
			displayUsingRecursion();
		}
	}

	public void reverseStackUsingRecursion(int r) {
		if(r > top/2) {
			return;
		}else {
			int temp =stack[r];
			stack[r] = stack[top-r];
			stack[top-r] = temp;
			r++;
			reverseStackUsingRecursion(r);
		}
	}
	public static void main(String[] args) {
		StackReverseUsingRecursion sr = new StackReverseUsingRecursion();
		for (int i = 0; i < 10; i++) {
			sr.push(i + 1);
		}
		System.out.println("Stack display without recursion : ");
		sr.display();
		System.out.println("Stack display using recursion : ");
		sr.displayUsingRecursion();
		System.out.println();
		System.out.println("Stack reverse using recursion : ");
		sr.reverseStackUsingRecursion(0);
		sr.display();
	}

}
