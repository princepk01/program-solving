package com.org.company.ivy;

public class IvyTest {
	enum Type { A, B, C }

		void handle(Type type) {
		    switch (type) {
		      case A:
		        System.out.println("A"); break;
		      case B:
		      case C:
		  
		        System.out.println("B or C"); break;
		    }
		  }
		  public static void main(String[] args) {
		    new IvyTest().handle(Type.B);
		    new IvyTest().handle(Type.C);
		  }
	}

