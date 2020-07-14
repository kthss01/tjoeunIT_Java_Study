package com.javateam.jse;

public class Test12 {

	public static void main(String[] args) {

//		int arr[][]; // 2차원 배열 선언
//		int [] arr[]; // 2차원 배열 선언
//		int [][]arr; // 2차원 배열 선언
//		int [][] arr; // 2차원 배열 선언

//		arr = new int[3][2];
//		arr = new int[3][]; // 가변 배열
//		arr = new int[][2]; // (X)

//		int arr[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // (O)
		int arr[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } }; // (O)
		// 배열의 초기화는 분리(X)
//		int arr[][];
//		arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // (X)

		// 가변 할당 : 2차원 배열의 각 요소 -> 1차원 배열
//		arr[0] = new int[3]; 
//		arr[1] = new int[2];
//		arr[2] = new int[10];

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		// forEach : 반복자(iterator) 패턴
		// 단순 검색시 일반 for문보다 성능 향상
		for (int[] subArr : arr) {
			for (int num : subArr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	} //

}
