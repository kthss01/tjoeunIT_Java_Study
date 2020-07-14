package com.javateam.jse;

public class Test10 {

	public static void main(String[] args) {
		
		int arr[]; // 배열(array)의 선언(declare)
		// c언어는 int arr[10]; 바로 할당할 수 있는데 자바는 안됨
		arr = new int[10]; 
		// 배열(변수)의 할당(대입)
		// 할당(allocation: 자리 잡음, assignment: 대입)
		// 10개의 요소 분량의 메모리를 할당
		
		int arr2[] = new int[10]; // 선언과 할당 동시에 가능
//		int [] arr2 = new int[10]; // 선언과 할당 동시에 가능
//		int arr2 [] = new int[10]; // 선언과 할당 동시에 가능
//		int arr2[] = new int[]; // (X) 숫자,변수를 반드시 넣어줘야함
		
//		int num;
//		System.out.println(num); // 지역변수는 초기값을 명시적으로 할당해줘야함
		
		System.out.println("배열의 길이(크기) : " + arr2.length);
		
		// 배열의 요소 삽입
		arr2[0] = 1;
		arr2[1] = 3;
		arr2[5] = 10;
		
//		System.out.println(arr2[0]); // 기본값이 들어감
//		System.out.println(arr2[5]);
		
		// 전체 요소 출력
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		// forEach문 : 다음 요소 검색 방식 
		// (반복자(iterator) 패턴)
		// for (낱개의 요소 : 전체) { ... }
		for (int num : arr2) {
			System.out.println(num);
//			num += 1; // 참조 안됨
		}
		
//		System.out.println(arr2[0]);
	} // 

}
