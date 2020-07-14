/**
 * 컴퓨터 클래스 -> Javadoc -> html 파일
 */
package com.javateam.jse;

/**
 * 자바 빈(bean - 콩)
 * 클래스를 자바 빈 객체라고도 부름
 * @author tjoeun 보통 계정이름이 들어감
 * 
 * 접근 제어자(제한자, 지시자) : 보안
 */

// 클래스와 파일명이 똑같아야함
public class Computer { // (O)
//class Computer { // default/package (O)
//private Computer { // (X)
//protected class Computer { // (X)

	// 접근 제어자(지시자, 변경자) : access modifier (modify가 변경하다 의미)
	// 멤버 필드(field) / 변수(variable) : 속성(attribute, property)
	/** 모니터 */
	// 자신의 클래스에서만 접근 허용 (가장 폐쇄(보안)적!)
	private String monitor; 
	/** 본체 */
	// 무표기(default, package)) : 자신의 소속 패키지에서만 접근 허용 
	static String mainBody; 
	/** 키보드 */
	// 상속 관계(부모/자녀)가 있으면 다른 패키지에 있어도 접근 허용 
	protected String keyboard; 
	/** 마우스 */
	// 모든 경우에 접근 허용 (가장 개방적!)
	public String mouse;
	
	////////////////////////////////////////////////////////
	
	// 멤버 메서드(함수)
	// 생성자(구축자) : Constructor 
	// : 인스턴스(객체)를 만드는 역할을 하는 특수 메서드
	// : 멤버 필드(변수) 초기화
	// 클래스와 동명(같은 이름)의 메서드
	// Computer()
	// 리턴형을 안써도 됨 (있지만 안쓴다고 보면 됨, 돌아는 감)
	// 인자 없는 생성자 = 기본(default: 기정, 기존) 생성자
	// 묵시적 선언이 가능 : 직접 구현 하지 않아도 사용 가능(코드에 등장하지 않아도 사용 가능)
	// 생성자 private public protected 쓸 수 있음
	public Computer() {
		System.out.println("기본 생성자");
	}
	
	// 오버로딩(over-loading, 인자가 over(추가적으로) 들어갔다는 의미) 생성자
	// 메서드 오버로딩 : 인자(매개변수)의 자료형 종류/개수/순서를 변경하여 같은 이름의 메서드를 다양하게 정의
	// 다형성의 일종
	public Computer(String monitor) {
		System.out.println("오버로딩 생성자");
		// 멤버 필드 <-- 인자
		// this : 자신의 객체(인스턴스)
		// this.멤버(필드/메서드)
		this.monitor = monitor;
//		monitor = monitor; // 이렇게 하면 인자가 우선, 그 다음이 멤버 필드임
		
		// 일반 메서드 호출 가능
//		print();
//		this.print();
//		staticPrint();
	}
	
	// 기본 생성자는 오버로딩 생성자가 있을 경우 기본 생성자를 사용하려면 "명시적"으로 정의해야 됨.
	
	////////////////////////////////////////////////////////////
	
	// 일반 멤버 메서드
	public void print() {
		System.out.println("print");
//		staticPrint();
	}
	
	// 메서드 오버로딩
	public void print(String str) {
		
	}
	
	// 메서드 오버로딩
	public void print(Object o) {
		
	}
	
	// 메서드 오버로딩
	public void print(String str, int n) {
		
	}
	
	// 메서드 오버로딩 (순서가 바뀌어도 오버로딩)
	public void print(int n, String num) {
		
	}
	
	// 가변인자라고 함 오버로딩할 때 조심해야함
	public void print(String... str) {
		
	}
	
	// 정적 멤버 메서드
	// 프로그램 종료 때까지 메모리(RAM)에 (고)정적인 주소를 가지는(static) 메서드
	// ex) 경복궁(문화재)
	// 특혜 -> 소금처럼 쓰는게 좋음 (너무 많이쓰면 짬 안쓰면 싱거우니 적절하게 쓰라는 얘기)
	// ex) Math 클래스 (수학 연산)
	public static void staticPrint() {
		System.out.println("static print");
//		print(); // (X)
		
//		Computer com1 = new Computer();
//		com1.print(); // (O)
		
//		new Computer().print(); // 무명 인스턴스(객체)(일회성) (O)  
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 -> Heap 자유 메모리 공간(더미 메모리)
		// new 연산자 -> 주소 할당 (임시)
		// -> 메모리 공간 반납 "자동" 반납 (JVM)
		// 가비지 컬렉션 (garbage collection)
		Computer com1 = new Computer();
		Computer com2 = new Computer("S사");
//		staticPrint();
		Computer.staticPrint();
		// Computer : 클래스 변수
//		monitor = "L사"; // (X)
//		mainBody = "K사"; // (O)
		Computer.mainBody = "K사";
		
//		System.out.println(com1.keyboard); // null 출력됨
		System.out.println(com1);
		System.out.println(com2);
	}
}
