// 자주색 : 키워드(keyword), 예약어
// 검정색 : 일반 지시어

package com.javateam.jse; // 패키지

/**
 * <b>문서화 주석(JavaDoc)</b> : 
 * Java Document(문서) -> html 문서화
 * 
 * @author tjoeun // 계정에서 가지고옴
 * 	이거를 html화시키기 때문에 tag 넣을 수 있음
 * @version 1.0
 * @since 2020.6.30
 */

// public : 접근 제어자(지시자, 변경자, 제한자)
// 가장 개방적인 접근 제어자
// class : 클래스. 자바 프로그램의 기본 단위
// ex) C언어의 구조체 + 객체지향 프로그래밍
// JavaEx1 : 클래스명 (Upper CamelCase 적용 : Pascal-Case라고도 함)
// { } 중괄호(brace) : 프로그램의 시작 ... 끝 
public class JavaEx1 {

	// 메인 함수(메서드) : 프로그램을 직접 실행하는 역할
	// 메서드 (method) : 객체 (소속 / 멤버 member) 함수 
	// 함수 (function) : 기능, 역할
	// static : (고)정적 : 프로그램이 끝날 때까지 메모리에 고정적이라는 의미
		// 너무 남용하면 안좋음, 중요할 때 적절히 써줘야함
	// ex) 문화재, 소금
	// void : 텅빈 => 함수(메서드)의 결과값(리턴값)이 없음 
	// 참고) C언어 : 위 의미 + 인자 없음의 의미도 있음 (생략 가능)
		// 자바에서는 인자 없음을 void로 쓰면 안됨
	// ex) void abcd(void) { ... }
	// (String[] args) : 
	// ( ) : 인자부, 인수부, 매개변수부
	// ex) 자판기 동전/지폐 투입구
	// 매개변수 (parameter), 인자/인수(argument) - 같은 걸로 간주하면 됨
		// parameter 가인자 argument 실인자 구분하기는 함
	// String : 문자열 (자료)형((Data) Type)
		// 끈 : 문자를 역었다
		// 문자열 : 문자들의 배열 (문자 모인거)
	// [] 대괄호(bracket) : 배열(array) 기호
	// args : 인자(인수/매개변수)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// // 한줄 주석(comment, notation)
		/*
		 * 문단 주석
		 * 
		 */
		/* 
		 문단 주석 
		 */
		
//		System.out.println("java 자바"); // 줄바꿈 있음
		// 줄바꿈(개행 : line-feed, line-break, word-wrap)
		System.out.print("java 자바"); // 개행 - 줄바꿈 없음
		System.out.println("python 파이썬");
		// System : 클래스
		// out : 표준 출력을 담당하는 필드 (멤버 변수)
			// standard output stream
		// 표준(std, standard) : 콘솔(모니터), 터미널(단말기)
			// 텍스트 모드(글자) : CLI(Command Line Interface)
		// 웹브라우저 -> 표준 출력(x)
		// in : 표준 입력 (키보드 입력만 해당)
			// 마우스 입력 -> 표준 입력(x)
		// "." : 구분자 역할
		// ex) 큰 단위.소속 작은 단위
		// println : print + line
		// (축)약어 모음 생략 자음만 가지고 축약어 활용
		// ex) index -> idx, count -> cnt, line -> ln
	}

}
