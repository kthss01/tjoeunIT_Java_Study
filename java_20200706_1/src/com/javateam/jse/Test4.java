package com.javateam.jse;

public class Test4 {

	public static void main(String[] args) {

		int sum = 0; // 합계
		int i = 1; // 카운터 변수 (누산/증감 변수)

		while (i <= 10) {
			// (1)
//			sum = sum + i;
//			i = i + 1;

//			System.out.println("i = " + i);
//			if (i == 5) break; // 분기
//			if (i % 2 == 0) continue; // 분기

			// (2)
//			sum += i;
//			i++;

			// (3)
//			sum += i;
//			++i;

			// (4)
//			sum += i++;

			// (5)
			if (i % 2 == 0) {
				i = i + 1;
				continue;
			} else {
				sum = sum + i;
			}
			
			i = i + 1;

			System.out.println(sum);
		} //

		System.out.println("1 ~ 10까지의 합계 : " + sum);
	} //

}
