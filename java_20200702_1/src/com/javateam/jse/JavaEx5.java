package com.javateam.jse;

public class JavaEx5 {
	public static void main(String[] args) {

		int money = 500;
//		String dinner = money >= 3000 ? "컵밥" : "단백질바";
		
		// 삼항연산자 이렇게 써도 괜찮을 듯
		String dinner = money >= 3000 ? "컵밥" :
						money >= 2000 ? "김밥" :
						money >= 1000 ? "삼각김밥" : "단백질바";
		
		System.out.println("dinner = " + dinner);

	} //
}
