package com.org.techmojo;

class A{
	public int x;
	private int y;
	
}
public class PujaTestMojo {

	int x=10;
	public static void main(String[] args) {
		String str = new String("Alice,Bob,Smith");
		String s = str.replaceAll(",", ":");
		System.out.println(s);
		A a = new A();
		
		boolean valuer[] = new boolean[] {true,false,true};
		Integer v[] = {new Integer(9),new Integer(0)};
		PujaTestMojo t = new PujaTestMojo();
		System.out.println(t.x);
		int val = 10;
		if((val>10 ? val++ : --val)<10) {
			System.out.println("mac");
		}
		if(val<10) {
			System.out.println("pc");
		}
		
		char ch[] = {'a','b'};
		String string = Character.toString(ch[1]).toLowerCase();
		

	}

}
