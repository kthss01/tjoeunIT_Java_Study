package com.javateam.jse;

public class Test16 {
	public static void main(String[] args) {
		// 별 인쇄 - 6
		/*
		 	  *********
			   *******
			    *****
			     ***
			      *
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n - i; j++)
				System.out.print(blank);
			for (int j = i * 2 - 1; j > 0; j--) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}
