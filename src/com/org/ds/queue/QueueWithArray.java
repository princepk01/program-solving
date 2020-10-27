package com.org.ds.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithArray {

	int front;
	int rare;
	int queueArray[];
	int capacity;
	int size;

	public QueueWithArray(int capacity) {
		this.capacity = capacity;
		queueArray = new int[this.capacity];

		this.front = this.size = 0;
		this.rare = 0;
	}

	public boolean isFull(QueueWithArray queue) {
		boolean flag = false;
		if (queue.size == queue.capacity) {
			flag = true;
		}
		return flag;
	}

	public boolean isEmpty(QueueWithArray queue) {
		boolean flag = false;
		if (queue.size == 0) {
			flag = true;
		}
		return flag;
	}

	public void enqueue(int data) {
		if (isFull(this)) {
			return;
		}
		//this.rare = (this.rare + 1) % this.capacity;
		this.queueArray[this.rare++] = data;
		this.size = this.size + 1;
	}

	public int dequeue() {
		if (isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int item = this.queueArray[this.front++];
		//this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int capacity = scan.nextInt();
		QueueWithArray queue = new QueueWithArray(capacity);
		System.out.println("Enqueue operation : ");
		for(int i=0;i<capacity;i++) {
			queue.enqueue(i+1);
			System.out.print(i+1+" ");
		}
		System.out.println();
		System.out.println("Dequeue operation : ");
		for(int i=0;i<queue.capacity;i++) {
			System.out.print(queue.dequeue()+" ");
		}
		scan.close();
		
		String s = "a";
		
	}

}
