package com.org.ans;

import java.util.Scanner;

public class FizzBuzz {
	 public static void fizzBuzz(int n) {
		 int i=1;
	        while(i<=n){
	            if(i%3 == 0 && i%5 == 0){
	                System.out.println("FizzBuzz");
	            }else if(i%3 == 0 && i%5 != 0){
	                System.out.println("Fizz");
	            }else if(i%3 != 0 && i%5 == 0){
	                System.out.println("Buzz");
	            }else if(i%3 != 0 && i%5 != 0){
	                System.out.println(i);
	            }
	            i++;
	        }
	    }

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	fizzBuzz(n);
	scan.close();
	}

}
