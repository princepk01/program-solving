//Write a function to delete a Linked List
package com.org.ds.linkedlist.question.solving;

import java.util.Scanner;

public class LinkedListDeletion {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static LinkedListDeletion list = new LinkedListDeletion();

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

	public static void deleteBeginningOfThelist() {
		if(list.head != null) {
			list.head = list.head.next;
		}
	}
	public static void deleteEndOfTheList() {
		if(list.head != null) {
			Node current = list.head;
			while(current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}
	public static void deleteBetweenOfTheList(int position) {
		if(list.head != null) {
			Node current = list.head;
			int counter = 1;
			while(current != null) {
				counter++;
				if(counter == position) {
					break;
				}
				current = current.next;
			}
			current.next = current.next.next;
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
		
		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		displayList();
		deleteBeginningOfThelist();
		displayList();
		System.out.println("Enter postion where you want to delete :");
		int position = scan.nextInt();
		deleteBetweenOfTheList(position);
		displayList();
		deleteEndOfTheList();
		displayList();
		reverseList();
		displayList();
		scan.close();
	}

}
