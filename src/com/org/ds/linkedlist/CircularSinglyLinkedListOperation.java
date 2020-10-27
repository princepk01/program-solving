package com.org.ds.linkedlist;

import java.util.Scanner;

public class CircularSinglyLinkedListOperation {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static CircularSinglyLinkedListOperation list = new CircularSinglyLinkedListOperation();

	public static void createCircularList(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
			newNode.next = list.head;
		} else {
			Node current = list.head;
			while (current.next != list.head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = list.head;
		}
	}

	public static void displayCircularLinkedList() {
		if (list.head != null) {
			Node current = list.head;
			/*while (current.next != list.head) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.print(current.data);*/
			
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != list.head);
		}
	}

	public static void insertBeginningOfTheCircularLinkedList(int data) {
		if (list.head != null) {
			Node current = list.head;
			while (current.next != list.head) {
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = list.head;
			list.head = newNode;
			current.next = list.head;
		}
	}

	public static void insertEndOfTheCircularLinkedList(int data) {
		if (list.head != null) {
			Node current = list.head;
			while (current.next != list.head) {
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = list.head;
			current.next = newNode;
		}
	}

	public static void insertBetweenOfTheCircularList(int data, int position) {
		if (list.head != null) {
			Node current = list.head;
			int counter = 1;
			while (current.next != list.head) {
				counter++;
				if (counter == position) {
					break;
				}
				current = current.next;
			}
			Node newNode = new Node(data);
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public static void deleteBeginningOfTheCircularList() {
		if (list.head != null) {
			Node current = list.head;
			while (current.next != list.head) {
				current = current.next;
			}
			list.head = list.head.next;
			current.next = list.head;
		}
	}

	public static void deleteEndOfTheCircularList() {
		if (list.head != null) {
			Node current = list.head;
			while (current.next.next != list.head) {
				current = current.next;
			}
			current.next = list.head;
		}
	}

	public static void deleteBetweenOfTheCircularLinkedList(int position) {

		if (list.head != null) {
			Node current = list.head;
			int counter = 1;
			while (current.next != list.head) {
				counter++;
				if (counter == position) {
					break;
				}
				current = current.next;
			}
			current.next = current.next.next;
		}
	}

	public static void reverseCircularLinkedList() {
		if (list.head != null) {
			Node current = list.head;
			Node next = null;
			Node prev = null;
			do {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}while (current != list.head);	
			
			list.head.next = prev;
			list.head = prev;
			displayCircularLinkedList();
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
					createCircularList(data);
				}
				break;
			case 2:
				displayCircularLinkedList();
				break;
			case 3:
				System.out.println("\nEnter data : ");
				data = scan.nextInt();
				insertBeginningOfTheCircularLinkedList(data);
				break;
			case 4:
				System.out.println("Enter position where you want to insert : ");
				position = scan.nextInt();
				System.out.println("Enter data :");
				data = scan.nextInt();
				insertBetweenOfTheCircularList(data, position);
				break;
			case 5:
				System.out.println("Enter data : ");
				data = scan.nextInt();
				insertEndOfTheCircularLinkedList(data);
				break;
			case 6:
				deleteBeginningOfTheCircularList();
				break;
			case 7:
				System.out.println("Enter position where you want to delete.");
				position = scan.nextInt();
				deleteBetweenOfTheCircularLinkedList(position);
				break;
			case 8:
				deleteEndOfTheCircularList();
				break;

			case 9:
				reverseCircularLinkedList();
				break;

			case 10:
				System.exit(0);
				break;
			}
		}
	}

}
