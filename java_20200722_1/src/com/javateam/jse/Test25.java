package com.javateam.jse;

public class Test25 {
	public static void main(String[] args) {
		
		String str = "123";
		
//		int num = (int)str; // (X)
		int num = new Integer(str); // (O)
//		int num = Integer.parseInt(str); // (O)
//		int num = Integer.valueOf(str); // (O)
		
//		System.out.println(num + 1);
		System.out.println(Integer.toBinaryString(num));
		
	}
}
