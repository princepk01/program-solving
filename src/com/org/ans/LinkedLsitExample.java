package com.org.ans;

public class LinkedLsitExample {

	Node head;

	static class Node {
		Node next;
		Node prev;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	static LinkedLsitExample list = new LinkedLsitExample();

	public static void insertBetween(int data, int position) {
		// 1 2   3 4 5
		
		//6
		if (list.head != null) {
			Node temp = list.head;
			int counter = 0;

			while (temp != null) {
				if (counter == position) {
					break;
				}
				counter++;
				temp = temp.next;
			}
			Node current = temp.next;
			Node newNode = new Node(data);
			newNode.next= temp.next;
			newNode.prev=temp;
			temp.next = newNode;
			current.prev = newNode;
			
			
		}
	}
	
	public void deleteBetween(int pos) {
		if(list.head != null) {
			Node temp = list.head;
			int counter=0;
			while(temp != null) {
				
				if(counter == pos) {
					break;
				}
				counter++;
				temp = temp.next;
			}
			Node current = temp.prev;
			current = temp.next;
			//current
			
		}
	}

	public static void main(String[] args) {

	}

}
