//Search an element in a Linked List (Iterative and Recursive)
package com.org.ds.linkedlist.question.solving;

import java.util.Scanner;

public class SearchElementInLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static SearchElementInLinkedList list = new SearchElementInLinkedList();

	public static void createList(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
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

	public static boolean searchelementByIterative(int element) {
		boolean flag = false;
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				if (current.data == element) {
					flag = true;
					break;
				}
				current = current.next;
			}
		}
		return flag;
	}

	public static boolean searchElementByRecursive(Node temp, int element) {
		if (temp != null) {
			if (temp.data == element) {
				return true;
			}
		} else {
			return false;
		}
		return searchElementByRecursive(temp.next, element);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		displayList();
		System.out.println("Enter element which your want to search : ");
		int element = scan.nextInt();

		boolean flag = searchelementByIterative(element);
		if (flag) {
			System.out.println("Element found in the list by iterative : " + element);
		} else {
			System.out.println("Element not found in the list by iterative : " + element);
		}

		boolean flag1 = searchElementByRecursive(list.head, element);
		if (flag1) {
			System.out.println("Element found in the list by recursive : " + element);
		} else {
			System.out.println("Element not found in the list by recursive : " + element);
		}
		scan.close();
	}

}
