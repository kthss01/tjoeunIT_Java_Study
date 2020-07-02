package com.javateam.jse;

public class JavaEx3 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
//		a++;
//		b++;
//		++a;
//		++b;
		
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
		
		System.out.println("a : " + ++a); // 2 : 전위 ++ : 먼저 더함
		System.out.println("b : " + b++); // 1 : 후위 ++ : 나중에 더한다
		
//		System.out.println("a : " + a); // 2
	}

}
