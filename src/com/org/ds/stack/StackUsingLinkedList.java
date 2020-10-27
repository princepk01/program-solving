package com.org.ds.stack;

public class StackUsingLinkedList {

	StackNode top;

	static class StackNode {
		int data;
		StackNode next;

		public StackNode(int data) {
			this.data = data;
		}
	}

	static StackUsingLinkedList stackList = new StackUsingLinkedList();

	public static void push(int data) {
		StackNode newNode = new StackNode(data);
		if (stackList.top == null) {
			stackList.top = newNode;
		} else {
			newNode.next = stackList.top;
			stackList.top = newNode;
		}
	}

	public static int pop() {
		if (stackList.top == null) {
			System.out.println("Stack is underflow.");
		} else {
			StackNode popNode = stackList.top;
			stackList.top = stackList.top.next;
			return popNode.data;
		}
		return 0;
	}

	public static void display() {
		if (stackList.top == null) {
			System.out.println("Stack is underflow.");
		} else {
			StackNode current = stackList.top;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		System.out.println();
	}

	public static void reverseStack() {
		if (stackList.top == null) {
			System.out.println("Stack is underflow.");
		} else {
			StackNode current = stackList.top;
			StackNode prev = null;
			StackNode next = null;

			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			stackList.top = prev;
			display();
		}
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			push(i);
		}
		System.out.println("Stack element is : ");
		display();
		System.out.println("Poped element in stack is : " + pop());
		display();
		System.out.println("Reverse of the stack : ");
		reverseStack();

	}

}
