package com.org.company.altimetric;

import java.util.Vector;

class MyVector extends Vector<Object>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i=1;
	public MyVector() {
		i=2;
	}
}
public class MyNewVector extends MyVector {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public MyNewVector() {
	i=4;
}
	public static void main(String[] args) {
		//MyVector v = new MyNewVector();

	}

}
