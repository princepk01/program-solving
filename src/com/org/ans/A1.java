package com.org.ans;

import java.util.ArrayList;
import java.util.function.Predicate;

class B {
	int b;      

	B(int b) {
		this.b = b;
	}
      
	@Override
	public String toString() {
		return "B [b=" + b + "]";
	}

	
}

public class A1 {

	public static void main(String[] args) {

		
		ArrayList<B> list = new ArrayList<>();
		list.add(new B(10));
		list.add(new B(25));
		list.add(new B(30));
		list.add(new B(41));
		list.add(new B(50));
		list.add(new B(65));
		System.out.println(list);
		list.forEach(a->System.out.print(a.b+" "));
		list.stream().forEach(System.out::println);
		Predicate<B> p = a->a.b%2==0;
		for(B b1 : list) {
			
			if(p.test(b1)) {
				System.out.println("even : "+b1.b);
			}
		}
		

	}

}
