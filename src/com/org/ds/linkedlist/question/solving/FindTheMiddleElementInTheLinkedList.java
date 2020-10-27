/*
Find the middle of a given linked list in C and Java
Given a singly linked list, find middle of the linked list. 
For example, if given linked list is 1->2->3->4->5 then output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print second middle element. 
For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
*/
package com.org.ds.linkedlist.question.solving;

public class FindTheMiddleElementInTheLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static FindTheMiddleElementInTheLinkedList list = new FindTheMiddleElementInTheLinkedList();

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
			System.out.println();
		}
	}

	public static int findMiddlementInTheList() {
		int data = 0;
		if (list.head != null) {
			Node current = list.head;
			Node temp = list.head;
			while (current != null && current.next != null) {
					current = current.next.next;
					temp = temp.next;
			}
			data = temp.data;
		}
		return data;
	}

	public static void main(String[] args) {

		for (int i = 1; i <10; i++) {
			createLinkedList(i);
		}
		displayLinkedList();
		int data = findMiddlementInTheList();
		System.out.println("Middle lement in the list is : "+data);
	}

}
