package com.org.company.altimetric;
class BaseException extends Exception{
	
}
class DerivedException extends BaseException{
	
}
public class MainException {

	public static void main(String[] args) {
		try {
			throw new DerivedException();
		}catch(BaseException b) {
			System.out.println("caught base exception");
		} /*
			 * catch(DerivedException d) { System.out.println("caught derived exception"); }
			 */
	}

}
