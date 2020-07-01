package com.javateam.jse;

import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaEx3 {

	public static void main(String[] args) {
		byte b = 1; // -128 ~ +127 (0 포함해서 하나 빠지는거)
		short s = 200;
		b = (byte) s; // 값의 결손 !

		short s2 = 100;
		b = (byte) s2;

		// 200 : short (X), int (O)
		// why) 값의 범위와 무관하게 정수 리터럴(값)
		// => 기본) 32비트 정수형(int)
		// b = 200; // (X)
		// b = (byte) 200; // (O)

//		int num = 200L; // long(8바이트) -> int(4바이트) (X)
//		int num = (int)200L;
//		int num = 010; // 8진수(octal)
//		int num = 0x10; // 16진수(hexadecimal)

		byte a2 = 100;
//		int num2 = a2; // (O) 
//		int num2 = (int)a2; // (O) 
		// 작은 자료형의 값 -> 큰 자료형의 값 (자동 형변환)
//		System.out.println(a2);

		// 각 자료형의 범위
		// %d - decimal
		/*
		 * System.out.printf("%d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		 * System.out.printf("%d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
		 * System.out.printf("%d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		 * System.out.printf("%f ~ %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
		 * System.out.printf("%e ~ %e\n", Float.MIN_VALUE, Float.MAX_VALUE);
		 * System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		 */

		final String MAIN_LANG = "자바"; // 상수(Constant) all 대문자로 _로 구분
		// 값의 재대입 불가
		// 기정(기존)값 보호(캡슐화:encapsulation)
//		MAIN_LANG = "파이썬";

		// long longVal = 11111111111111111111111; // out of range
		// BigDecimal BigInteger long보다 큰거
		// BigDecimal 큰 10진수
		// 너무 큰 숫자는 참조형 자료형인 BigInteger 사용해서 처리

		BigDecimal big1 = new BigDecimal("11111111111111111111111111");
		BigDecimal big2 = new BigDecimal("11111111111111111111111111");
		BigInteger big3 = new BigInteger("11111111111111111111111");
		BigInteger big4 = new BigInteger("22222222222222222222222");

		System.out.println(big1.add(big2));
		System.out.println(big3.add(big4));
		
		// 부동 연산 float double 차이가 있음
        double num1 = 1 + 5.6d + 5.8D;
        float num2 = 1f + 5.6f + 5.8f;
       
        System.out.println(num1);
        System.out.println(num2);
       
        boolean flag = num1 == num2 ? true : false;
       
        System.out.println("flag : " + flag);
	}

}
