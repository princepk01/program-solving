//Linked List Insertion
package com.org.ds.linkedlist.question.solving;

import java.util.Scanner;

public class LinkedListInsertion {

	Node head;

	static class Node {
		int data;
		Node next = null;

		Node(int data) {
			this.data = data;
		}
	}

	static LinkedListInsertion list = new LinkedListInsertion();

	public static void createLinkedList(int data) {
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

	public static void displayLinkedList() {
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		System.out.println();
	}

	public static void addBeginningOfTheList(int data) {
		if (list.head != null) {
			Node newNode = new Node(data);
			newNode.next = null;

			newNode.next = list.head;
			list.head = newNode;
		}
	}

	public static void addEndOfTheList(int data) {
		if (list.head != null) {
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = null;
			current.next = newNode;
		}
	}

	public static void addBetweenOfTheList(int data, int position) {
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
			// 1 2 6 3 4 5
			Node newNode = new Node(data);
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public static void reverseList() {
		if(list.head != null) {
			Node current = list.head;
			Node next = null;
			Node prev = null;
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			list.head = prev;
		}
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			createLinkedList(i);
		}
		displayLinkedList();
		System.out.println("Enter data to add beginning : ");
		int data = scan.nextInt();
		addBeginningOfTheList(data);
		displayLinkedList();
		System.out.println("Enter position to insert between : ");
		int position = scan.nextInt();
		System.out.println("Enter data to insert between :");
		data = scan.nextInt();
		addBetweenOfTheList(data, position);
		displayLinkedList();
		System.out.println("Enter data to add end of the list : ");
		data = scan.nextInt();
		addEndOfTheList(data);
		displayLinkedList();
		reverseList();
		displayLinkedList();
		scan.close();
	}

}
