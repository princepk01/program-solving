package com.org.company.altimetric;

class MyThread implements Runnable {
	public void run() {
		System.out.println("Thread name is :: "+Thread.currentThread().getName());
		
	}
}
public class Ideone {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt,"Thread1");
		Thread t2 = new Thread(mt,"Thread2");
		t1.start();
		t2.start();
		System.out.println("in main thread");
	}

}
