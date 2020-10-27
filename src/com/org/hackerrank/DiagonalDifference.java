package com.org.hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

	public static int diagonalDifference(int matrix[][]) {
		int d1 = 0;
		int d2 = 0;
		for (int i = 0; i < matrix.length; i++) {

			d1 += matrix[i][i];
			d2 += matrix[i][matrix.length - i - 1];
		}
		System.out.println("d1 : " + d1 + " === d2 : " + d2);
		return Math.abs(d1-d2);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int row = scan.nextInt();
		int col = scan.nextInt();
		int matrix[][] = new int[row][col];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				matrix[r][c] = scan.nextInt();
			}
		}
		System.out.println("Diagonal Difference Is : "+diagonalDifference(matrix));

		scan.close();
	}

}
