package com.org.ans;

public class OuterClassExample {
	public void outerMethod() {
		System.out.println("this is outer class method");
		InnerClass inner = new InnerClass();
		inner.showUtil();
	}

	class InnerClass {
		public void showUtil() {
			System.out.println("this is inner class");
		}
	}

	public static void main(String[] args) {

		OuterClassExample o = new OuterClassExample();
		OuterClassExample.InnerClass i = o.new InnerClass();
		o.outerMethod();
		i.showUtil();
	}

}
