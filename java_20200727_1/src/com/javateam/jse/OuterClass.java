package com.javateam.jse;

public class OuterClass {

	// has-a 관계 : 인스턴스 멤버 클래스
	class InstanceInnerClass {
		String name;

		InstanceInnerClass() {
			System.out.println("내부 클래스 생성자");
		}

		void print() {

		}
	}
	
	// 정적 멤버(내부) 클래스
	static class StaticInnerClass {
		String name;

		public StaticInnerClass() {
			System.out.println("정적 내부 클래스");
		}
		
		void print() {
			
		}
	}
	
	public void innerMethod() {
		
		// 지역 클래스
		class LocalClass {
			String name;
			LocalClass() {}
			void print() {}
		}
	}
	
	public void innerMethod2() {
		
		// 지역 클래스
		class LocalClass {
			String name;
			LocalClass() {}
			void print() {}
		}
	}

	public static void main(String[] args) {
		
//		OuterClass.InstanceInnerClass inner = 
//				new OuterClass().new InstanceInnerClass();		
//		inner.print();
		
		StaticInnerClass staticClass = 
//		OuterClass.StaticInnerClass staticClass = 
				new StaticInnerClass(); // (O)
//				new OuterClass().new StaticInnerClass(); // (X)
//				OuterClass.new StaticInnerClass(); // (X)
				// test
//				new OuterClass().StaticInnerClass(); // (X)
	}
}
