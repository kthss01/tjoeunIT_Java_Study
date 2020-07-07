package com.javateam.jse;

public class Test13 {
	public static void main(String[] args) {

		// 별 인쇄 - 3
		/*
		 	  *****
			  ****
			  ***
			  **
			  *
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}
