package com.javateam.jse;

// 클래스
public class Member {
	
	// 멤버(소속) 필드(변수)
	String id;
	String name;
	double money;
	String degree;
	
	// 생성자 (Constructor: 일본에서는 구축자) : 모성 (미국에서 남편 성 따라가는 느낌)
	public Member() {
		
	}
	
	// 멤버(소속) 함수(기능) -> 멤버(소속) 메서드(method - 방법)
	// c언어 시절 구조체에서는 함수가 안들어갔음
	void work() {
		System.out.println("work");
	}
	
	// static은 고정 (마음대로 옮길 수는 없음)
	public static void main(String[] args) {
		
		// 객체(좁은 의미 뜻 : object, instance(인스턴스)) 생성
		// Member : 클래스 = 부성
		// Member() : 생성자  = 모성
		// member : 자녀 (인스턴스)
		// 상급자 하급자 관계로 보는게 좋음
		// new : 동적 변수 생성 연산자(키워드)
		Member member = new Member(); // Member 클래스는 참조형 자료형이기도 함
		member.id = "abcd1234";
		member.name = "홍길동";
		member.work();
		
	}
	
}
