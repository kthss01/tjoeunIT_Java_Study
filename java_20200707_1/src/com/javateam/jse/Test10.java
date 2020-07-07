package com.javateam.jse;

public class Test10 {
	public static void main(String[] args) {
		
		// for문 써서 별 찍기 연습
		
		// (1)
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");

		// (2)
//		for (int i = 0; i < 5; i++) {
//			System.out.println("*");
//		}
		
		// (3)
//		for (int i=0; i<5; i++) System.out.println("*");
		
		// (4)
//		for (int i=0; i<5; i++) System.out.print('*');
		
		// (5)
//		for (int i=5; i>0; i--) System.out.print("* ");
//		System.out.print("*****");
		
		// (6)
//		for (int i=0; i<5; i++) {
//			System.out.println("* * * * *");
//		}
		
		// (7)
//		for (int i=0; i<5; i++) {
////			System.out.println("* * * * *");
//			// for (i=0; i<5; i++) { // (x)
//			for (int j=0; j<5; j++) { // (7) 카운터 변수 교체 (i -> j)
//				System.out.print("* ");
//			}
//			System.out.println("i : " + i); // log (기록)
//		}
		
		// (8) : 별 -> 숫자(정수)
//		for (int i=1; i<=5; i++) {
//			
//			for (int j=1; j<=5; j++) { 
//				System.out.print((j*i) + " ");
//			}
//			System.out.println(); 
//		}
		
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 * 
		 */
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=5; j++) {
				int num  = 5*(i-1) + j;
				System.out.print(num);
				
				if(num < 10)
					System.out.print("  ");
				else
					System.out.print(" ");
			}
			System.out.println(); 
		}
	}
}
