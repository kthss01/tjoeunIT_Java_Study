package com.javateam.jse;

public class Test21 {
	public static void draw(int n, int i) {
		System.out.print(String.format("%" + ((n - i - 1) * 2 + 1) + "s", "-").replace("-", ""));
		System.out.print(String.format("%" + ((i * 4) + 1) + "c\n", '*').replace(" ", "*"));
	}

	public static void main(String[] args) {
		// 별 인쇄 - 11
		/*
		 	  *****************
			    *************
			      *********
			        *****
			          *
			        *****
			      *********
			    *************
			  *****************
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;

		// blank pattern 0 2 4 6 8 6 4 2 0
		// star pattern 17 13 9 5 1 5 9 13 17

//		for (int i = n - 1; i > 0; i--) {
//			for (int j = 0; j < (n - i - 1) * 2; j++)
//				System.out.print(blank);
//			for (int j = 0; j < i * 4 + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < (n - i - 1) * 2; j++)
//				System.out.print(blank);
//			for (int j = 0; j < i * 4 + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}

		// String format

//		for (int i = n - 1; i > 0; i--) {
//			System.out.print(String.format("%" + ((n - i - 1) * 2 + 1) + "s", "-").replace("-", ""));
//			System.out.print(String.format("%" + ((i * 4) + 1) + "c\n", '*').replace(" ", "*"));
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.print(String.format("%" + ((n - i - 1) * 2 + 1) + "s", "-").replace("-", ""));
//			System.out.print(String.format("%" + ((i * 4) + 1) + "c\n", '*').replace(" ", "*"));
//		}

		// 함수 사용
		for (int i = n - 1; i > 0; i--) 
			draw(n, i);
		for (int i = 0; i < n; i++)
			draw(n, i);
	}
}
