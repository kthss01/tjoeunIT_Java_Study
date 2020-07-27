package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test31 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
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
		
//		map.entrySet().forEach(x -> System.out.println(x));
//		map.entrySet().forEach(System.out::println);
		// test
//		map.entrySet().forEach(x -> System.out.println(x.getKey()));
		
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = map.get(key);
//			System.out.println(key + " = " + value);
//		}

//		map.keySet().forEach(x->System.out.println(x + "=" + map.get(x)));
		
		map.forEach((k,v) -> System.out.println(k + "=" + v));
		
		System.out.println(map.size());
		
	} //
}
