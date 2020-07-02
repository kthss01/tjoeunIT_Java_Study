package com.javateam.jse;

import java.util.Scanner;

public class JavaEx6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 표준 입력
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		System.out.println("score : " + score);

		/*
		 * 학점 : credit(학점이란 말도 있음) 90 ~ 100 : A, 80 ~ 89 : B, 70 ~ 79 : C, 60 ~ 69 : D,
		 * 0 ~ 59 : F
		 */

		char credit = 'F';

		score /= 10; // 나눠버리면 or로 처리가능
		
		// TODO : if ~ else if ~ else 이용
//		if (score >= 9) {
		if (score == 9 || score == 10) {
			credit = 'A';
//		} else if (score >= 8) {
		} else if (score == 8) {
			credit = 'B';
//		} else if (score >= 7) {
		} else if (score == 7) {
			credit = 'C';
//		} else if (score >= 6) {
		} else if (score == 6) {
			credit = 'D';
		} else {
			credit = 'F';
		}

		// 삼항연산자로 해보기
		credit = score == 9 || score == 10 ? 'A' :
				score == 8 ? 'B' : 
				score == 7 ? 'C' : 
				score == 6 ? 'D' : 'F'; 

		System.out.println("당신은 " + credit + "학점입니다.");

		
//		int[] tests = {100,95,85,75,65,30};
//		for (int i : tests) {
//			score = i / 10;
//			// 삼항연산자로 해보기
//			credit = score == 9 || score == 10 ? 'A' :
//					score == 8 ? 'B' : 
//					score == 7 ? 'C' : 
//					score == 6 ? 'D' : 'F'; 
//			System.out.println("당신은 " + credit + "학점입니다.");
//		}

	}

}
