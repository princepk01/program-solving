package com.org.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {
	  public static void bonAppetit(List<Integer> bill, int k, int b) {
		  int billSum = 0;
	  
		 for(int i=0; i<bill.size();i++) {
			 if(k != i) {
				 billSum += bill.get(i);
			 }
		 }
		 billSum = billSum/2;
		 if(billSum == b) {
			 System.out.println("Bon Appetit");
		 }else {
			 System.out.println(b-billSum);
		 }
	  }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		int b = scan.nextInt();
		bonAppetit(list, k, b);
		
		scan.close();
	}

}
