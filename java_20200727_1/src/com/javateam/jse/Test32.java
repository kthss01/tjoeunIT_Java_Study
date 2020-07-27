package com.javateam.jse;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test32 {
	
	public static void main(String[] args) {
		
//		Map<String, String> map = new HashMap<>();
		NavigableMap<String, String> map = new TreeMap<>();
		
		map.put("무교동", "낙지");
		map.put("신당동", "떡볶이");
		map.put("신림동", "순대");
		map.put("마장동", "육고기");
		map.put("응암동", "감자탕");
		map.put("장충동", "족발");
		map.put("노량진", "회");
		
		map.put("수원", "통닭");
		map.put("의정부", "부대찌개");

		// 중복 테스트
		map.put("응암동", "감자탕");
		map.put("응암동", "뼈다귀감자탕");
		map.put("노량진", "회");
		map.put("노량진", "회");
		map.put("수원", "통닭");
		map.put("수원", "왕갈비 통닭");
		
//		map.subMap("노량진", "수원")
//		map.subMap("노량진", true, "수원", true)
//		map.headMap("장충동", true)
//		map.tailMap("수원", true)
//		map.descendingMap()
//			.forEach((k,v) -> System.out.println(k + "=" + v));
		
		map.descendingKeySet()
			.forEach(x -> System.out.println(x + "=" + map.get(x)));
		
		
	} //
}
