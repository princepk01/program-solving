package com.org.ds.linkedlist.repeat;

import java.util.Scanner;

public class SingleLinkedListRepeat {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static SingleLinkedListRepeat list = new SingleLinkedListRepeat();

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

	public static void insertBeginningOfTheList(int data) {
		if (list.head != null) {
			Node newNode = new Node(data);
			newNode.next = list.head;
			list.head = newNode;
		}
	}

	public static void insertEndOfTheList(int data) {
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

	public static void insertBetweenOfTheList(int data, int position) {
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
			// 1 2 3 4 5
			Node newNode = new Node(data);
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public static void deleteBeginningOfTheList() {
		if (list.head != null) {
			list.head = list.head.next;
		}
	}

	public static void deleteEndOfTheList() {
		if (list.head != null) {
			Node current = list.head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	// 1 2 3 4 5
	public static void deleteBetweenOfTheList(int position) {

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
			current.next = current.next.next;
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
					createList(data);
				}
				break;
			case 2:
				displayList();
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
				reverseList();
				break;
			case 10:
				System.exit(0);
				break;
			}
		}
	}

}
