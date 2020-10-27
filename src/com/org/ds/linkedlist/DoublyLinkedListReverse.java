package com.org.ds.linkedlist;

public class DoublyLinkedListReverse {

	Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	static DoublyLinkedListReverse list = new DoublyLinkedListReverse();

	public static void displayList() {
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
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
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(6);

		list.head = n1;
		n1.prev = null;
		n1.next = n2;
		n2.prev = n1;
		n2.next = n3;
		n3.prev = n2;
		n3.next = n4;
		n4.prev = n3;
		n4.next = n5;
		n5.prev = n4;
		n5.next = null;
		displayList();
		System.out.println();
		System.out.println("=================");
		reverseDoublyLinkedList();
	}

}
