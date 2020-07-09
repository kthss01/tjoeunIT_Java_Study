package com.javateam.jse;

public class Test20 {
	public static void draw(int n, int i) {
		System.out.print(String.format("%" + ((n - i - 1) * 2 + 1) + "s", "-").replace("-", ""));
		System.out.print(String.format("%" + ((i * 4) + 1) + "c\n", '*').replace(" ", "*"));
	}

	public static void main(String[] args) {
		// 별 인쇄 - 10
		/*
		 	          *
			        *****
			      *********
			    *************
			  *****************
			    *************
			      *********
			        *****
			          *
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;

		// blank pattern 8 6 4 2 0 2 4 6 8
		// star pattern 1 5 9 13 17 13 9 5 1

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < (n - i - 1) * 2; j++)
//				System.out.print(blank);
//			for (int j = 0; j < i * 4 + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}
//		for (int i = n - 2; i >= 0; i--) {
//			for (int j = 0; j < (n - i - 1) * 2; j++)
//				System.out.print(blank);
//			for (int j = 0; j < i * 4 + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}

		// String format

//		for (int i = 0; i < n; i++) {
//			System.out.print(String.format("%" + ((n - i - 1) * 2 + 1) + "s", "-").replace("-", ""));
//			System.out.print(String.format("%" + ((i * 4) + 1) + "c\n", '*').replace(" ", "*"));
//		}
//		for (int i = n - 2; i >= 0; i--) {
//			System.out.print(String.format("%" + ((n - i - 1) * 2 + 1) + "s", "-").replace("-", ""));
//			System.out.print(String.format("%" + ((i * 4) + 1) + "c\n", '*').replace(" ", "*"));
//		}

		// 함수 사용
		for (int i = 0; i < n; i++)
			draw(n, i);
		for (int i = n - 2; i >= 0; i--) 
			draw(n, i);
	}
}
