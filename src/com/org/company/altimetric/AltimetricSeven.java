package com.org.company.altimetric;

class Base{
	public static void show() {
		System.out.println("base::show() called");
	}
}
class Derived extends Base{
	public static void show() {
		System.out.println("Derived::show() called");
	}
}
public class AltimetricSeven {

	public static void main(String[] args) {
		Base b = new Derived();
		b.show();

	}

}
