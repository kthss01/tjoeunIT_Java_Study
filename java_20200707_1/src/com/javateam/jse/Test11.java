package com.javateam.jse;

public class Test11 {

	public static void main(String[] args) {

		// 별 인쇄 - 1
		/*
			*
			 *
			  *
			   *
			    *
		 */

		char star = '*';
		char blank = ' ';
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(blank);
			}
			System.out.println(star);
		}

	}

}
