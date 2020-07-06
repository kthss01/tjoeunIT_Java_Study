package com.javateam.jse;

public class Test8 {

	public static void main(String[] args) {

		// 1~100까지의 홀수의 합계 (홀수의 갯수를 구해버림)
//		int n = 100;
//		int cnt = 0;
//		for (int i = 0; i < n; i++) {
//			if (i % 2 != 0) {
//				System.out.println("홀수: " + i);
//				cnt++;
//			}
//		}
//
//		System.out.println("홀수의 합계: " + cnt);

		int sum = 0;
//		for (int i = 1; i <= 100; i = i + 2) {
//		for (int i = 1; i <= 100; i += 2) {
//		for (int i = 99; i >= 1; i -= 2) {
		for (int i = 99; i >= 1; i = i - 2) {
			sum += i;
			System.out.println(sum);
		}

		System.out.println("1~100까지의 홀수의 합계 : " + sum);
	}

}
