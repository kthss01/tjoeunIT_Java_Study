package com.javateam.jse;

public class JavaEx2 {

	public static void main(String[] args) {

		int num; // ex) 32평형 건축(단독 주택) : 초기(빈 집)
		// 변수의 선언
		// ex) 건물(집) = 변수(variable = var) -> 값(데이터) 다양화
		// int(integer[인티저]:정수) = (자료)형((data) type) (形)
		// 32비트(4바이트) 정수 자료형(정수형)

		// 지역 변수(local variable)
		// : 어떤 영역(메서드(함수), 블럭) 내부에서 선언된 변수
		// 초기화 => 선언 이후에 값이 대입(assign 할당) !
		// 빈 집 => 초기화(X)
		// -> 입주 = 값(value, 리터럴(literal), 상수) 대입
		num = 1; // 초기화 (initialization)

		// int num = 2; // 다시 선언 (X)
		int num2 = 2;
		num2 = 3;

		// num2 = "a"; // 타입 불일치 -> 대입 (x) : 문자열 -> 정수
		// num2 = 'a'; // 문자 -> 정수 (자동 변환) : 97 (ASCII 코드표)
		// num2 = '0'; // 문자 -> 정수 (자동 변환) : 48
		// num2 = 2.1; // double(64비트 실수형) -> int(32비트 정수형)
		num2 = (int) 2.1; // 수동 형변환(casting) 2.1 -> 2
		// 소수부 값 결손 !
		num2 = (int) 2.8f; // float(32비트 실수형) -> int(32비트 정수형)

		// 기본(원시, primitive(프리미티브)) 자료형간에는
		// () 연산자(형변환 연산자)로 변환 가능 !
		// 참조형 자료형과 기본형과의 변환은 () 연사자로는 불가 !
		// num2 = (int)"10"; // (X)
//		num2 = Integer.parseInt("10");
//		num2 = Integer.valueOf("10");
		num2 = new Integer("13");
		// 기본형과 참조형간의 변환 -> 형변환(casting) 메서드 사용

		// num2 = num2 + 1; // 변수 <= 기존 변수 값 + 1 (연산:operation)
		// = : 대입 연산자(operator - 운영자라는 뜻도 있음), + : 덧셈(가산) 연산자
		// num2, 1 : 피연산자(operand)
		
		num2 += 1; // num2 = num2 + 1 와 동일 의미(축약 표현)
		// += : 덧셈 + 대입 (혼합 연산)
		
//		int class = 1; // 키워드 (X)
		// int classNum = 1; // (O)
		
		System.out.println(num2);
	} //

}
