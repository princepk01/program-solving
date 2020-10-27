package com.org.company.altimetric;
public class SampleDemop implements Runnable {

	private Thread t;
	private String threadName;
	SampleDemop(String threadName){
		this.threadName = threadName;
	}
	public void run() {
		while(true) {
			System.out.println(threadName);
		}
	}
	public void start() {
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	public static void main(String[] args) {
		SampleDemop s = new SampleDemop("price");
		s.start();
	}

}
