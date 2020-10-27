package com.org.ds.stack;

public class SortStackUsingRecursion {

	int MAX = 100;
	int stack[] = new int[MAX];
	int top = -1;

	public void push(int element) {
		if (top >= MAX) {
			System.out.println("Stack is overflow.");
		} else {
			stack[++top] = element;
		}
	}

	public void displayStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public void sortStack() {
		for (int i = 0; i <= top; i++) {
			for (int j = i+1; j <= top; j++) {
				if (stack[i] < stack[j]) {
					int temp = stack[i];
					stack[i] = stack[j];
					stack[j] = temp;
				}
			}
		}
	}
	
	public void sortStackWithRecursion() {
		
	}

	public static void main(String[] args) {
		SortStackUsingRecursion sort = new SortStackUsingRecursion();
		for (int i = 0; i < 10; i++) {
			if(i %2 == 0)
			sort.push(i + 1);
		}
		for (int i = 0; i < 10; i++) {
			if(i %2 != 0)
			sort.push(i + 1);
		}
		sort.displayStack();
		System.out.println("Sorting stack without using recursion : ");
		sort.sortStack();
		sort.displayStack();
	}

}
