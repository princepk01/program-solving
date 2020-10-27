package com.org.company.subex;

public class FindMiddleElementInSinglyLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static FindMiddleElementInSinglyLinkedList list = new FindMiddleElementInSinglyLinkedList();

	public static void displayLinkedList() {
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}
	public static void findMiddleElementInLinkedList() {
		if(list.head != null) {
			Node current = list.head;
			Node temp = list.head;
			int counter = 1;
			while(current.next != null) {
				if(current.next.next != null) {
					current = current.next.next;
					//counter+=2;
				}else {
					break;
				}
				counter++;
				temp = temp.next;
			}
			System.out.println("\nMiddle element is : "+temp.data+" === "+counter+" ==== "+temp.next.data);
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		//Node n8 = new Node(80);

		list.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
//		n6.next = n7;
//		n7.next = null;
		//n8.next = null;
		displayLinkedList();
		findMiddleElementInLinkedList();
	}

}
