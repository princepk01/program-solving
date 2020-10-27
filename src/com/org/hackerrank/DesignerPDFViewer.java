package com.org.hackerrank;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static int designerPdfViewer(int[] h, String word) {
		//{6,5,7,3,6,7,3,4,4,2,3,7,1,3,7,4,6,1,2,4,3,3,1,1,3,5};
		//zbkkfhwplj
		int min = 1;
		int max = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int charIndex = (int) ch - 96;
			int tempValue = h[charIndex-1];

			if(tempValue >= max) {
				max = tempValue;
			}else if(tempValue <=min){
				min = tempValue;
			}
		}
		int value = min*word.length()*max;
		System.out.println("value : "+value);
		return value;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int size = scan.nextInt();
		//int arr[] = {1, 3, 1, 3,1 ,4 ,1, 3 ,2, 5, 5 ,5, 5, 5 ,5, 5, 5, 5, 5 ,5, 5, 5, 5 ,5 ,5 ,7};
		int arr[] = {6,5,7,3,6,7,3,4,4,2,3,7,1,3,7,4,6,1,2,4,3,3,1,1,3,5};
		
//		for (int i = 0; i < size; i++) {
//			arr[i] = scan.nextInt();
//		}
		String word = scan.nextLine();
		System.out.println(designerPdfViewer(arr, word));
		scan.close();

	}

}
