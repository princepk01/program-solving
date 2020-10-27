package com.org.company.altimetric;

import java.io.IOException;

class Parent{
	public void method() throws IOException{
		System.out.println("Parent");
	}
}
public class Child extends Parent{
	
	public void method() throws IOException{
		System.out.println("child");
	}
	public static void main(String[] args) throws IOException{
		Parent p =new Child();
		p.method();
	}

}
