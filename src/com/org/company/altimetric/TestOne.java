package com.org.company.altimetric;

class A {}
class B extends A {}
class C extends B {}

public class TestOne {

	public static void main(String[] args) {
		B b = new B();

		if (b instanceof B) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		if ((b instanceof B) && (!(b instanceof A))) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		if ((b instanceof B) && (!(b instanceof C))) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
