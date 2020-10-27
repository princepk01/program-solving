package com.org.ds.linkedlist;

import java.util.Scanner;

public class LinkedListOperation {
	Node head;
	static LinkedListOperation list = new LinkedListOperation();

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public static void createLinkedList(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public static void displayLinkedList() {
		if (list.head != null) {
			Node temp = list.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		} else {
			System.out.println("List not found.");
		}
	}

	public static void insertBeginningOfTheList(int data) {
		if (list.head != null) {
			Node newNode = new Node(data);
			newNode.next = list.head;
			list.head = newNode;
		} else {
			System.out.println("List not found.");
		}
	}

	public static void insertEndOfTheList(int data) {
		Node temp = list.head;
		if (temp != null) {
			while (temp.next != null) {
				temp = temp.next;
			}
			Node newNode = new Node(data);
			temp.next = newNode;
			newNode.next = null;
		} else {
			System.out.println("List not found.");
		}
	}

	public static void insertBetweenOfTheList(int data, int position) {
		int counter = 0;
		Node temp = list.head;
		if (temp != null) {
			while (temp != null) {
				counter++;
				if (counter == position) {
					break;
				}
				temp = temp.next;
			}
			// 1 2 6 3 4 5
			Node newNode = new Node(data);
			newNode.next = temp.next;
			temp.next = newNode;
		} else {
			System.out.println("List not found.");
		}
	}

	public static void deleteBeginningOfTheList() {
		if (list.head != null) {
			list.head = list.head.next;
		} else {
			System.out.println("List not found.");
		}
	}

	public static void deleteEndOfTheList() {
		Node temp = list.head;
		if (temp != null) {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		} else {
			System.out.println("List not found.");
		}
	}

	public static void deleteBetweenOfTheList(int position) {
		Node temp = list.head;
		if (temp != null) {
			int counter = 1;
			while (temp != null) {
				counter++;
				if (counter == position) {
					break;
				}
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	public static void reverseLinkedList() {
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
		displayLinkedList();
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
				reverseLinkedList();
				break;
			case 10:
				System.exit(0);
				break;
			}
		}
	}

}
