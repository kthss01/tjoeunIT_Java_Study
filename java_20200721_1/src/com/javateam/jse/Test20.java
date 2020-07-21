package com.javateam.jse;

public class Test20 {

	String name = "홍길동";
	int age = 20;
	double money = 20000;
	
	/*
	 * toString => to : 변환의 의미
	 * 	String (문자열)
	 *  : 문자열 변환 => 메시지/연산/값 의 결과
	 *  객체를 바로 인쇄 => 자동 호출 (toString)
	 *  ex)
	 *  System.out.println(test);            
	 *  System.out.println(test.toString()); 
	 *  
	 *  일반적인 용도) 객체의 멤버들의 내용 확인 (출력)
	 */
//	@Override
//	public String toString() {
//		return super.toString() + "\nTest20 class";
//	}
	
//	@Override
//	public String toString() {
//		return "Test20 [name=" + name + ", age=" + age + ", money=" + money + "]";
//	}

	
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Test20 [name=");
//		builder.append(name);
//		builder.append(", age=");
//		builder.append(age);
//		builder.append(", money=");
//		builder.append(money);
//		builder.append("]");
//		return builder.toString();
//	}
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Test20 [name=")
//			   .append(name)
//			   .append(", age=")
//			   .append(age)
//			   .append(", money=")
//			   .append(money)
//			   .append("]");
//		return builder.toString();
//	}

	
	
//	@Override
//	public String toString() {
//		return String.format("Test20 [name=%s, age=%s, money=%s]", name, age, money);
//	}

	public static void main(String[] args) {
		
		Test20 test = new Test20();
		// ex) com.javateam.jse.Test20@15db9742
		// getClass().getName) + '@' + Integer.toHexString(hashCode());
		System.out.println(test);
//		System.out.println(test.toString());
		
		// test
//		System.out.println(new Test20());
		
//		Test20 test2 = new Test20();
		Test20 test2 = test;
		System.out.println(test.equals(test2));
	}

}
