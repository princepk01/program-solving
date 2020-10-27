package com.org.ds.linkedlist;

import java.util.Scanner;

public class DoublyLinkedListOperaton {

	Node head;
	static DoublyLinkedListOperaton list = new DoublyLinkedListOperaton();

	static class Node {
		Node prev;
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public static void createLinkedList(int data) {
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
			newNode.prev = current;
			current.next = newNode;
		}
	}

	public static void displayLinkedList() {
		Node current = list.head;
		if (current != null) {
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

	public static void insertBeginningOfTheList(int data) {
		if (list.head != null) {
			Node newNode = new Node(data);
			newNode.next = list.head;
			newNode.prev = null;
			list.head.prev = newNode;
			list.head = newNode;
		}
	}

	public static void insertEndOfTheList(int data) {
		Node current = list.head;
		if (current != null) {
			while (current.next != null) {
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = null;
			current.next = newNode;
			newNode.prev = current;
		}
	}

	public static void insertBetweenOfTheList(int data, int position) {
		Node current = list.head;
		if (current != null) {
			int counter = 0;
			while (current != null) {
				counter++;
				if (counter == position) {
					break;
				}
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
		}
	}

	public static void deleteBeginningOfTheList() {
		if (list.head != null) {
			list.head = list.head.next;
			list.head.prev = null;
		}
	}

	public static void deleteEndOfTheList() {
		Node current = list.head;
		if (current != null) {
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public static void deleteBetweenOfTheList(int position) {
		Node current = list.head;
		if (current != null) {
			int counter = 1;
			while (current != null) {
				counter++;
				if (counter == position) {
					break;
				}
				current = current.next;
			}
			current.next = current.next.next;
			current.next.prev = current;
		}
	}
//1 2 3 4 5
	public static void reverseDoublyLinkedList() {
		Node temp = null;
		Node current = list.head;
		if (current != null) {
			while (current != null) {
				temp = current.prev;
				current.prev = current.next;
				current.next = temp;
				current = current.prev;
			}
			if (temp != null) {
				list.head = temp.prev;
			}
			displayLinkedList();
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\n1.  Create Linked List.");
			System.out.println("2.  Display Linked List");
			System.out.println("3.  Insert Beginning Of The List");
			System.out.println("4.  Insert Between Of The List");
			System.out.println("5.  Insert End Of The List");
			System.out.println("6.  Delete Beginning Of The List.");
			System.out.println("7.  Delete Between Of The List.");
			System.out.println("8.  Delete End Of The List.");
			System.out.println("9.  Reverse Of The Linked List.");
			System.out.println("10.  Exit.");

			System.out.print("\nEnter your choice : ");
			int choice = scan.nextInt();
			int data = 0;
			int position = 0;
			switch (choice) {
			case 1:
				System.out.print("\nEnter list size : ");
				int size = scan.nextInt();
				System.out.println("\nEnter data : ");
				while (size-- != 0) {
					data = scan.nextInt();
					createLinkedList(data);
				}
				break;
			case 2:
				displayLinkedList();
				break;
			case 3:
				System.out.println("\nEnter data : ");
				data = scan.nextInt();
				insertBeginningOfTheList(data);
				break;
			case 4:
				System.out.println("Enter position where you want to insert : ");
				position = scan.nextInt();
				System.out.println("Enter data :");
				data = scan.nextInt();
				insertBetweenOfTheList(data, position);
				break;
			case 5:
				System.out.println("Enter data : ");
				data = scan.nextInt();
				insertEndOfTheList(data);
				break;
			case 6:
				deleteBeginningOfTheList();
				break;
			case 7:
				System.out.println("Enter position where you want to delete.");
				position = scan.nextInt();
				deleteBetweenOfTheList(position);
				break;
			case 8:
				deleteEndOfTheList();
				break;
			case 9:
				reverseDoublyLinkedList();
				break;
			case 10:
				System.exit(0);
				break;
			}
		}
	}

}
