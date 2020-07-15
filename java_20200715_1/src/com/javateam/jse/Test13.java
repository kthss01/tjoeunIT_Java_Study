package com.javateam.jse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test13 {
	public static void main(String[] args) {

		String twice[] = { "나연", "다현", "정연", "모모", "사나", "쯔위", "채영", "지효", "미나" };

		// 한번에 리스트로 변환
		List<String> twiceList = Arrays.asList(twice);
//		ArrayList<String> twiceList = new ArrayList<>();
//		List<String> twiceList = new ArrayList<>(); // 보통 이렇게 많이 쓰는 편, 뒤에 생략 가능
//		twiceList.add("나연");

//		for (int i = 0; i < twice.length; i++) {
//			twiceList.add(twice[i]);
//		}
//		for (String s : twice) {
//			twiceList.add(s);
//		}
		
		// 람다(lambda) 연산 (함수형 프로그래밍)
//		twiceList.forEach(t->System.out.println(t));
//		twiceList.forEach(System.out::println);
		
		// 오름차순 정렬 (ascending sort/order)
//		twiceList.sort(Comparator.naturalOrder());
//		twiceList.forEach(System.out::println);
		
		// 내림차순 정렬 (descending sort/order)
//		twiceList.sort(Comparator.reverseOrder());
//		twiceList.forEach(System.out::println);
		
		// 체이닝(chaining) 기법 : 여러 문장 -> 하나의 문장
//		twiceList.stream()
//				.sorted()
//				.forEach(System.out::println);
		
		Arrays.asList(twice)
			  .stream()
			  .sorted(Comparator.reverseOrder())
			  .forEach(t->System.out.println(t));
	} //
}
