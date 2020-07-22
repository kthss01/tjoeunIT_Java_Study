package com.javateam.jse;

public class Test23 {

	public static void main(String[] args) {

//		StringBuilder sb = "abcd"; // (X)
		StringBuilder sb = new StringBuilder();
//		sb = "java"; // (X)
//		sb.append("java");
//		sb.append(1);
//		sb.append('c');
//		sb.append(1.8);
//		sb.append(true);

		// 체이닝 기법도 가능
		sb.append("java")
		  .append(1)
		  .append('c')
		  .append(1.8);
		
		System.out.println(sb);
	}

}
