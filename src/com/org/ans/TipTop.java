package com.org.ans;

import java.util.PriorityQueue;

public class TipTop {


	


	public static void main(String arr[]) {

		PriorityQueue<String> toDo = new PriorityQueue<String>();
		
		toDo.add("dishes");
		toDo.add("laundry");
		toDo.add("bills");
		toDo.offer("bills");
		
		
		System.out.print(toDo.size()+" "+toDo.poll());
		System.out.print(" "+toDo.peek()+" "+toDo.poll());
		System.out.print(" "+toDo.poll()+" "+toDo.poll());
	
		
		
	}
}
