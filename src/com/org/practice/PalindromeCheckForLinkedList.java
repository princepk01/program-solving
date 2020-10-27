package com.org.practice;

import java.util.Stack;

public class PalindromeCheckForLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	static PalindromeCheckForLinkedList list = new PalindromeCheckForLinkedList();

	public static void createList(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		newNode.prev = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}

	public static void displayList() {
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public static boolean palindromeCheck() {
		Stack<Integer> stack = new Stack<>();
		boolean flag = false;
		if(list.head != null) {
			Node current = list.head;
			while(current != null) {
				stack.push(current.data);
				current = current.next;
			}
			Node temp = list.head;
			while(temp != null) {
				int data = stack.pop();
				if(temp.data == data) {
					flag = true;
				}else {
					flag = false;
					break;
				}
				temp = temp.next;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		createList(1);
		createList(2);
		createList(3);
		createList(2);
		createList(1);
		createList(1);
		boolean flag = palindromeCheck();
		if(flag) {
			System.out.println("list is palindrome");
		}else{
			System.out.println("List is not palindrome");
		}
	}

}
