package com.javateam.jse;

public class Test5 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		do {
			sum += i++;
			System.out.println(sum);
		} while (i <= 10);

		System.out.println("1~10 합계 : " + sum);
	}

}
