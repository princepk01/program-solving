package com.org.ds.linkedlist;

import java.util.Stack;

public class LinkedListPalindromeCheck {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void displayList() {
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

	public static boolean palindromeCheck() {
		if (list.head != null) {
			Stack<Integer> s = new Stack<Integer>();
			Node c = list.head;
			while (c != null) {
				s.push(c.data);
				c = c.next;
			}

			Node temp = list.head;
			boolean flag = false;
			while (temp != null) {
				int i = s.pop();
				if (temp.data == i) {
					flag = true;
				} else {
					flag = false;
					break;
				}
				temp = temp.next;
			}
			return flag;
		}
		return false;
	}

	public static void reverseList() {
		if (list.head != null) {
			Node current = list.head;
			Node prev = null;
			Node next = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			list.head = prev;
			displayList();
		}
	}

	public static void moveElementToFront() {
		if(list.head == null || list.head.next == null)  
           return; 

     Node secLast = null; 
     Node last = list.head; 

     while (last.next != null)   
     { 
        secLast = last; 
        last = last.next;  
     } 
     secLast.next = null; 

     last.next = list.head; 
     list.head = last; 
     displayList();
	}
	static LinkedListPalindromeCheck list = new LinkedListPalindromeCheck();

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(6);

		list.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		displayList();
		System.out.println();
		if (palindromeCheck()) {
			System.out.println("List is palindrome");
		} else {
			System.out.println("List is not palindrome");
		}
		reverseList();
		System.out.println("================");
		moveElementToFront();
	}

}
