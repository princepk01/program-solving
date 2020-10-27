//Find Length of a Linked List (Iterative and Recursive)
package com.org.ds.linkedlist.question.solving;

public class FindLengthTheLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static FindLengthTheLinkedList list = new FindLengthTheLinkedList();

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

	public static void reverseList() {
		if (list.head != null) {
			Node current = list.head;
			Node next = null;
			Node prev = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			list.head = prev;
		}
	}
	
	public static int findLengthOfTheListByRecursion(Node temp) {
		if(temp == null){
			return 0;
		}
		return 1+findLengthOfTheListByRecursion(temp.next);
	}
	
	public static int findLengthOfTheListByIterative(Node temp) {
		int counter=0;
		if(temp != null) {
			while(temp != null) {
				counter++;
				temp = temp.next;
			}
		}
		return counter;
	}
	

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			createList(i);
		}
		displayList();
		System.out.println("reverse List : ");
		reverseList();
		displayList();
		System.out.println("Length of the node by recursive : "+ findLengthOfTheListByRecursion(list.head));
		System.out.println("Length of the node by iterative : "+ findLengthOfTheListByIterative(list.head));
	}

}
