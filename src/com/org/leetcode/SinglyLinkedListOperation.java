package com.org.leetcode;

public class SinglyLinkedListOperation {

	Node head = null;

	class Node {
		int data;
		Node next = null;

		public Node(int data) {
			this.data = data;
		}
	}

	public void createLinkedList(SinglyLinkedListOperation list, int data) {

		Node newNode = new Node(data);
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

	public void printList(SinglyLinkedListOperation list) {
		if (list.head != null) {
			Node current = list.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public void insertBeginningOfTheList(SinglyLinkedListOperation list, int data) {
		if (list.head != null) {
			Node newNode = new Node(data);
			newNode.next = list.head;
			list.head = newNode;
		}
	}

	public void insertEndOfTheList(SinglyLinkedListOperation list, int data) {
		if (list.head != null) {
			Node newNode = new Node(data);
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void insertBetweenOfTheList(SinglyLinkedListOperation list, int data, int position) {
		if (list.head != null) {
			int counter = 1;
			Node current = list.head;
			while (current != null) {
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

	public void deleteBeginningOfTheList(SinglyLinkedListOperation list) {
		if (list.head != null) {
			list.head = list.head.next;
		}
	}

	public void deleteEndOfTheList(SinglyLinkedListOperation list) {
		if (list.head != null) {
			Node current = list.head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void deleteBetweenOfTheList(SinglyLinkedListOperation list, int position) {
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

	public void reverseLinkedList(SinglyLinkedListOperation list) {
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
			printList(list);
		}
	}

	public static void main(String[] args) {

		SinglyLinkedListOperation list = new SinglyLinkedListOperation();
		for (int i = 1; i <= 10; i++) {
			list.createLinkedList(list, i);
		}
		list.printList(list);
		System.out.println("insert beginning of the list");
		list.insertBeginningOfTheList(list, 11);
		list.printList(list);
		System.out.println("insert end of the list");
		list.insertEndOfTheList(list, 12);
		list.printList(list);
		System.out.println("insert between of the list");
		list.insertBetweenOfTheList(list, 13, 2);
		list.printList(list);
		System.out.println("reverse of the list");
		list.reverseLinkedList(list);
		System.out.println("delete beginning of the list");
		list.deleteBeginningOfTheList(list);
		list.printList(list);
		System.out.println("delete end of the list");
		list.deleteEndOfTheList(list);
		list.printList(list);
		System.out.println("delete between of the list");
		list.deleteBetweenOfTheList(list, 3);
		list.printList(list);
		System.out.println("reverse of the list");
		list.reverseLinkedList(list);
	}

}
