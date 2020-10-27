package com.org.practice;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

	public static void fibonacciSeriesusingRecursion(int n, int i, int j, int k, int c) {
		
		if(c<=n) {
			System.out.print(k+" ");
			i=j;
			j=k;
			k=i+j;
			fibonacciSeriesusingRecursion(n, i, j, k,++c);
		}
			
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		fibonacciSeriesusingRecursion(number, 0, 1, 0, 1);
		System.out.println();
		int i=0;
		int j=1;
		int k=0;
		int counter =1;
		while(counter<=number) {
			System.out.print(k+" ");
			i=j;
			j=k;
			k=i+j;
			counter++;
		}
		
		scan.close();

	}

}
