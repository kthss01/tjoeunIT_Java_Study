package com.javateam.jse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test33 {
	
	public static void main(String[] args) {
		
		String[] foods = {
				"오징어", "배추", "명태", "문어", 
				"대구", "무", "파", "양파", 
				"대구", "무", "파", "양파", 
				"청어", "문어", "피망"
		};
		
		String[] seaFoods = {
				"오징어", "대구", "명태",
				"청어", "문어", "꼴뚜기",
				"민어", "광어", "미역", "가리비"
		};
		
		List<String> foodList = Arrays.asList(foods);
		List<String> seaFoodList = Arrays.asList(seaFoods);
		
		// Query (질의)
//		foodList.stream()
//				.distinct() // 중복 제거
////				.forEach(x -> System.out.println(x));
////				.forEach(System.out::println);
//				
//				.filter(x -> seaFoodList.contains(x)) // 참 거짓으로 떨어져야함
//				
////				.collect(Collectors.groupingBy(x -> seaFoodList.contains(x)))
////				.collect(Collectors.groupingBy(x -> seaFoodList.contains(x)))
////				.get(true).stream() // map 리턴되니 get으로 list 가져와서 stream으로 치환
////				.get(false).stream() // map 리턴되니 get으로 list 가져와서 stream으로 치환
//				
////				.sorted()
//				.sorted(Comparator.reverseOrder()) // 내림차순
////				.count(); // 갯수 반환
//				.limit(3) // 최대 몇개만 가져오는거 
//				.forEach(System.out::println);
		
		/////////////////////////////////////////////////
		foodList.stream()
				.distinct()
				.filter(x -> !seaFoodList.contains(x))
				.sorted(Comparator.naturalOrder())
				.forEach(System.out::println);
		
//		System.out.println(foodList.contains("오징어"));
//		System.out.println(foodList.contains("갑오징어"));
	} // 
}
