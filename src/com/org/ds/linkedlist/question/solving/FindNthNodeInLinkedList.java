//Write a function to get Nth node in a Linked List
/*
Input:  1->10->30->14,  index = 2
Output: 30  
The node at index 2 is 30
*/
package com.org.ds.linkedlist.question.solving;

import java.util.Scanner;

public class FindNthNodeInLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static FindNthNodeInLinkedList list = new FindNthNodeInLinkedList();

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

	public static int findElmentByIndex(int index) {
		int data = 0;
		if(list.head != null) {
			Node current = list.head;
			int counter = 0;
			while(current != null) {
				counter++;
				if(counter == index) {
					data = current.data;
					break;
				}
				current = current.next;
			}
		}
		return data;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		displayList();
		System.out.println("Enter index where you want to search element : ");
		int index = scan.nextInt();
		int found = findElmentByIndex(index);
		if(found != 0) {
			System.out.println("Element found : "+found+" at index : "+index);
		}else {
			System.out.println("Element not found at index : "+index);
		}
		scan.close();
	}

}
