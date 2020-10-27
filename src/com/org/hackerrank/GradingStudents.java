package com.org.hackerrank;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while(testCase-- != 0) {
				int grade = scan.nextInt();
				int tempGrade = grade/5;
				int newGrade = tempGrade*5 + 5;
				int tempGradeDiff = newGrade - grade;
				if(newGrade < 40) {
					System.out.println(grade);
				}else if(tempGradeDiff < 3) {
					System.out.println(newGrade);
				}else if(tempGradeDiff == 3) {
					System.out.println(grade);
				}else {
					System.out.println(grade);
				}
		}
		scan.close();

	}

}
