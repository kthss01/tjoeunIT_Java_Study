package com.javateam.jse;

public class Test19 {
	public static void main(String[] args) {
		// 별 인쇄 - 9
		/*
		 	  *****************
			    *************
			      *********
			        *****
			          *
		 */

		char star = '*';
		char blank = ' ';
		int n = 5;
		// star pattern 17 13 9 5 1 (n-i-1) * 4 + 1
		// blank pattern 0 2 4 6 8 i * 2
//		for (int i = 0; i < n; i++) {
//			// blank
//			for (int j = 0; j < i * 2; j++)
//				System.out.print(blank);
//			// star
//			for (int j = 0; j < (n - i - 1) * 4 + 1; j++)
//				System.out.print(star);
//			System.out.println();
//		}

		// String format을 이용한 방법
		for (int i = 0; i < n; i++) {
			// 잘못 생각했음 이거 위치가 8 6 4 2 0 이 아니라 9 7 5 3 1 인데 이걸 바꾸는거 (9s 7s 5s 3s 1s를 날리는 거임)
			System.out.print(String.format("%" + (i * 2 + 1) + "s", "-").replace("-", ""));
			System.out.print(String.format("%" + (4 * (n - i - 1) + 1) + "c%n", '*').replace(" ", "*"));
		}

	}
}
