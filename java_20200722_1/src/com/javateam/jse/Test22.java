package com.javateam.jse;

public class Test22 {
	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java"); // 인스턴스
		String str4 = new String("java"); // 인스턴스
		String str5 = str4;

		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
//		System.out.println(str1 == str2); // 값으로 비교

//		System.out.println(str1 == str3); // 다른 생성 과정으로 인해 "주소값" 비교 => false
		System.out.println(str3 == str4); // "주소값"으로 비교 => false
//		System.out.println(str4 == str5); // 주소값이 같아서 true
		
//		System.out.println(str1.equals(str4)); // "값"으로 비교 (오버라이딩)
		System.out.println(str1.contentEquals(str4)); 
		
	}
}
