package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test30 {
	
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
		
//		System.out.println(map.get("응암동"));
		
//		Set<Map.Entry<String, String>> set = map.entrySet(); // 이건 import Map.Entry 안해도됨
		Set<Entry<String, String>> set = map.entrySet(); // 이건 key가 set이 아님
		Iterator<Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()) {
//			Entry<String, String> entry = it.next();
//			String key = entry.getKey();
//			String value = entry.getValue();
			
//			Entry<?,?> entry= it.next();
//			String key = (String) entry.getKey();
//			String value = (String) entry.getValue();
			
			Entry<? extends String,? extends String> entry= it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " = " + value);
		} //
		
	} //
}
