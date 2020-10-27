package com.org.ans;

class A{
	public int x;
	private int y;
	void cal(int a, int b) {
		x= a+1;
		y=b;
	}
}
public class FindRealFactor {

	public static long realFactory(long low, long high) {
		int p1=0;
		int p2 = 0;
		long count=0;
		long mul=0;
		while(p1<=6) {
		p2=0;
			while(p2<=6) {
				double power2 = Math.pow(3, p1);
				double power1 =  Math.pow(5, p2);
				 mul = (long) (power1*power2);
				if(mul>=low && mul <=high) {
					count++;
				}
				p2++;
			}
			p1++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		A obj = new A();
		obj.cal(2, 3);
		//System.out.println(obj.x+":"+obj.y);
	}

}
