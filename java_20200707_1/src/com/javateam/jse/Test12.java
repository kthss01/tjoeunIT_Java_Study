package com.javateam.jse;

public class Test12 {
	public static void main(String[] args) {
		
		// 별 인쇄 - 2
		/*
	 		  *
	 		  **
	 		  ***
	 		  ****
	 		  *****
		 */
		
		char star = '*';
		char blank = ' ';
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
	}
}
