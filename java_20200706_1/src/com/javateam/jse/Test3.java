package com.javateam.jse;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		System.out.print("점수 입력: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char credit = 'F';

		switch (score / 10 + "") {
		case "10": case "9": credit = 'A'; break;
		case "8" : credit = 'B'; break;
		case "7" : credit = 'C'; break;
		case "6" : credit = 'D'; break;
		default: credit = 'F'; break;
		}
		
		System.out.println("학점: " + credit);
		sc.close();
	}

}
