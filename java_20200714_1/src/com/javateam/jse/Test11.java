package com.javateam.jse;

public class Test11 {

	public static void main(String[] args) {

		// 배열의 초기화
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // c언어에서 쓰던거 허용해주는거라고 보면됨
//		int arr[7] = { 1, 2, 3, 4, 5, 6, 7 }; // (X) c언어에서는 가능
//		int arr[] = new int[]{ 1, 2, 3, 4, 5, 6, 7 }; // (O)
//		int arr[] = new int[7]{ 1, 2, 3, 4, 5, 6, 7 }; // (X)
		
		arr[0] = 10;
		System.out.println(arr[0]);
		
		// 개인적으로 테스트 해보니 이것도 가능
//		int[] arr2 = arr;
//		System.out.println(arr2[0]);
		
		int arr2[];
		arr2 = new int[] {1,2,3,4};
	} //

}
