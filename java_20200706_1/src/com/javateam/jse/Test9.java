package com.javateam.jse;

public class Test9 {

	public static void main(String[] args) {
		// TODO while문만 이용해서 구구단 구해보기

		int dan = 2;
		int times = 1;

		while (dan <= 9) {
			
			while (times <= 9) {
//				System.out.println(dan + " X " + times + " = " + dan * times);
				System.out.printf("%d x %d = %d\n",
						dan, times, (dan * times));
				times++;
//				System.out.println(times);
			}
			
			times = 1;
			System.out.println("----------");
			dan++;
		}
	}

}
