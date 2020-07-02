package com.javateam.jse;

public class JavaEx4 {

	public static void main(String[] args) {

		int money = 2500;
		String dinner = "";

		if (money >= 3000) {
			dinner = "컵밥";
		} else if (money >= 2000) {
			dinner = "줄김밥";

			if (money >= 2500)
				dinner += " 라면";

		} else if (money >= 1000) {
			dinner = "삼각김밥";
		} else {
			dinner = "단백질바";
		}

		System.out.println("dinner : " + dinner);
	}

}
