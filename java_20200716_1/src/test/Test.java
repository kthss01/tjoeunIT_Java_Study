package test;

import america.Child;
import korea.Parent;

public class Test {
	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = new Parent();
		
		// 다형성의 일종
		// 참조 자료형의 형 변환 (interface도 가능)
		// 상속(구현) 관계일 경우만 해당
		// 자동 변환
		// 부모 클래스의 객체 <- 자녀 클래스의 객체
		// date, sqldate 클래스 경우에서는 다른 방법으로 해야 함 
		parent = child;
		
		// 수동 변환
		// 자녀 클래스의 객체 <- 부모 클래스의 객체
		child = (Child) parent;
		
		// 기본 자료형의 형 변환 (type casting)
		int numInt = 1;
		long numLong = numInt;
		// 큰 자료형 변수 <- 작은 자료형 변수  
		// 자동 변환 : 프로모션(promotion - 증진)
		
		int numInt2 = (int) numLong; // 값의 손실이 있을 수 있음
		// 작은 자료형 변수 <- 큰 자료형 변수
		// 수동 변환 : 캐스팅(casting) - 통틀어서 casting이라고 하는데 detail하게 나누면 이게 casting
		
		// 클래스도 기본 자료형과 같은 게 있음
	}
}
