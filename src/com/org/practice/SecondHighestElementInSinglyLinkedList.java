package com.org.practice;

public class SecondHighestElementInSinglyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static SecondHighestElementInSinglyLinkedList list = new SecondHighestElementInSinglyLinkedList();

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

	public static void secondHighestElementInTheList() {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MAX_VALUE;
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				if (current.data >= max1) {
					max2 = max1;
					max1 = current.data;
					current = current.next;
				}
			}
		}
		System.out.println("max1 : " + max1 + " ======= max2 : " + max2);
	}

	public static void reverseLinkedList() {
		if (list.head != null) {
			Node current = list.head;
			Node next = null;
			Node prev = null;
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

	public static void findMiddleElementinLinkedList() {
		if (list.head != null) {
			Node current = list.head;
			Node temp = list.head;
			int m1 = Integer.MIN_VALUE;
			int m2 = Integer.MIN_VALUE;
			while (current != null && current.next != null) {
				current = current.next.next;
				m1 = temp.data;
				temp = temp.next;
				m2 = temp.data;
			}
			System.out.println("Middle element is : " + m1 + " &&& m2 :" + m2);
		}
	}

	public static void insertBetween(int data, int position) {
		if (list.head != null) {
			int counter = 1;
			Node current = list.head;
			while (current != null) {
				counter++;
				if (counter == position) {
					break;
				}
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = null;

			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		displayList();
		System.out.println();
		secondHighestElementInTheList();
		System.out.print("reverse list : ");
		// reverseLinkedList();
		System.out.println();
		findMiddleElementinLinkedList();
		System.out.println("insert between : ");
		insertBetween(15, 2);
		displayList();
	}

}
