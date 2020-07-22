package com.javateam.jse;

import java.util.StringTokenizer;

public class Test24 {
	public static void main(String[] args) {

//		String str = "java" + 1;
//		String str = 1 + 1 + "java" + 1; // 2java1
//		String str = 1 + 1 + "java" + 1 + 1; // 2java11
		String str = 1 + 1 + "java" + (1 + 'a'); // 2java98 // a = 97
//		System.out.println(str);

		char[] chArr = { 'j', 'a', 'v', 'a' };
		str = new String(chArr); // 문자의 배열 => 문자열
//		System.out.println(chArr);
//		System.out.println(str);
		chArr = str.toCharArray(); // 문자열 => 문자의 배열
		
		////////////////////////////////////////////
		
//		String str2 = "I am a Java Programmer.";
//		String str2 = "I am a Java, Python Programmer.";
		String str2 = "I am a Java Programmer. "
				+ "and Python Programmer.";
//		String strArr[] = str2.split(" "); // 정규표현식으론 " "가 \\s를 의미함
//		String strArr[] = str2.split("\\s"); // 공백((white) space, blank)
//		String strArr[] = str2.split(",");
//		String strArr[] = str2.split("."); // 주의 ! (X)
		String strArr[] = str2.split("\\."); // 주의 ! (O)
		
		// test 
//		String strArr[] = str2.split(""); // 이렇게하면 다 짤림
		
		
//		for (String s : strArr) {
//			System.out.println(s);
//		}
		
		////////////////////////////////////////////
		
//		StringTokenizer st = new StringTokenizer(str2); // 기본 구분자가 " "임
		StringTokenizer st = new StringTokenizer(str2, "."); // \\. 안해줘도 됨
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
 