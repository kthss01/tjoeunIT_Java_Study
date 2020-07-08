package com.javateam.jse;

public class Test18 {
	public static void main(String[] args) {
		// 별 인쇄 - 8
		/*
		 	          *
			        *****
			      *********
			    *************
			  *****************
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;
		// star 1 5 9 13 17 pattern 4 * i + 1
		// blank 8 6 4 2 0 pattern (n - i) * 2 - 2
//		for (int i = 0; i < n; i++) {
//			// blank
//			for (int j = 0; j < (n - i) * 2 - 2; j++)
//				System.out.print(blank);
//			// star
//			for (int j = 0; j < 4 * i + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}

		// String format을 이용한 방법
//		for (int i = 1; i <= 4; i++) {
//			System.out.print(String.format("%" + (6 - i) + "s", "-").replace("-", ""));
//			System.out.print(String.format("%" + (2 * i - 1) + "c%n", '*').replace(" ", "*"));
//		}
		for (int i = 0; i < n; i++) {
			// 잘못 생각했음 이거 위치가 8 6 4 2 0 이 아니라 9 7 5 3 1 인데 이걸 바꾸는거 (9s 7s 5s 3s 1s를 날리는 거임)
			System.out.print(String.format("%" + ((n - i) * 2 - 1) + "s", "-").replace("-", ""));
			System.out.print(String.format("%" + (4 * i + 1) + "c%n", '*').replace(" ", "*"));
		}

	}
}
