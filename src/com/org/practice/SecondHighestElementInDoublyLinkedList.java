package com.org.practice;

public class SecondHighestElementInDoublyLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	static SecondHighestElementInDoublyLinkedList list = new SecondHighestElementInDoublyLinkedList();

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

	public static void insertBetween(int data, int position) {
		if (list.head != null) {
			Node current = list.head;
			int counter = 1;
			while (current != null) {
				counter++;
				if (counter == position) {
					break;
				}
				current = current.next;
			}
			// 1  6   2 3 4 5
			Node newNode = new Node(data);
			newNode.next = current.next;
			current.next.prev = newNode;
			current.next = newNode;
			newNode.prev = current;
		}
	}
	
	public static void reverseDoublyLinkedList() {
		if(list.head != null) {
			Node current = list.head;
			Node temp = null;
			while(current != null) {
				temp = current.prev;
				current.prev = current.next;
				current.next = temp;
				current = current.prev;
			}
			if(temp != null) {
				list.head = temp.prev;
			}
			displayList();
		}
	}

	
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		displayList();
		System.out.println("insert betweeen of the list");
		insertBetween(15, 2);
		System.out.println("list is : ");
		displayList();
		System.out.println("reverse lsit ");
		reverseDoublyLinkedList();
	}

}
