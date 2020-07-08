package com.javateam.jse;

public class Test15 {
	public static void main(String[] args) {
		// 별 인쇄 - 5
		/*
		 	      *
			     ***
			    *****
			   *******
			  *********
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(blank);
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}
