package com.javateam.jse;

public class Test17 {
	public static void main(String[] args) {
		// 별 인쇄 - 7
		/*
		 	      *
			     ***
			    *****
			   *******
			  *********
			   *******
			    *****
			     ***
			      *
		 */

//		char star = '*';
//		char blank = ' ';
//		int n = 5;
//
//		// 위에꺼
//		for (int i = 0; i < n; i++) {
//			// blank
//			for (int j = 0; j < n - i - 1; j++)
//				System.out.print(blank);
//			// star
//			for (int j = 0; j < 2 * i + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}
//		// 아래꺼
//		for (int i = n - 1; i >= 0; i--) {
//			// blank
//			for (int j = 0; j < n - i; j++)
//				System.out.print(blank);
//			// star
//			for (int j = 0; j < i * 2 - 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}
//		for (int i = 0; i < n - 1; i++) {
//			// blank
//			for (int j = 0; j < i + 1; j++)
//				System.out.print(blank);
//			// star
//			for (int j = 0; j < (n - i) * 2 - 3; j++)
//				System.out.print(star);
//			System.out.println();
//		}

		// String format을 이용한 방법

		for (int i = 1; i <= 4; i++) {
			System.out.print(String.format("%" + (6 - i) + "s", "-").replace("-", ""));
			System.out.print(String.format("%" + (2 * i - 1) + "c%n", '*').replace(" ", "*"));
		}
		for (int i = 1; i <= 5; i++) {
			System.out.print(String.format("%" + i + "s", "-").replace("-", ""));
			System.out.print(String.format("%" + (2 * (5 - i) + 1) + "c%n", '*').replace(" ", "*"));
		}

	}
}
