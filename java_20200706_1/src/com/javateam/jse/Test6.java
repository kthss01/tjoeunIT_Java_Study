package com.javateam.jse;

public class Test6 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		// 무한(infinite) 반복문
		while (true) {
			if (i <= 10) {
				sum += i++;
				System.out.println(sum);
			} else {
				break;
			} // if
		} // while
	} // main
}
