package com.javateam.jse;

public class Test7 {

	public static void main(String[] args) {

		int sum = 0;
//		int i; // (2)
		int i = 1; // (3) (4)

//		for (int i = 1; i <= 10; i++) { // (1)
//		for (i = 1; i <= 10; i++) { // (2)
//		for (; i <= 10; i++) { // (3)
//		for (;; i++) { // (4)
//		for (;;) { // (5) == while (true)
		for (; i <= 10;) { // (6) == while (i <= 10)

			// (1) ~ (3)
//			sum += i;
//			System.out.println(sum);

			// (4)
//			if (i <= 10) {
//				sum += i;
//				System.out.println(sum);
//			} else {
//				break;
//			} //

			// (5)
//			if (i <= 10) {
////				sum += i;
////				i++;
//				sum += i++;
////				sum += ++i; // 결과가 다름 !
//				System.out.println(sum);
//			} else {
//				break;
//			} //

			// (6)
			sum += i++;
//			sum += ++i;
			System.out.println(sum);
		}

		System.out.println("1~10까지의 합 : " + sum);
	}

}
