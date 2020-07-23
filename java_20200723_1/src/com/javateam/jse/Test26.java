package com.javateam.jse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test26 {

	public static void main(String[] args) {
		
//		Set set = new HashSet();
//		Set<Object> set = new HashSet<Object>();
		Set<String> set = new HashSet<>();
		set.add("광화문");
		set.add("남대문 시장");
		set.add("경복궁");
		set.add("창경궁");
		set.add("남대문 시장");
		set.add("동소문");
		set.add("남대문 시장");
		set.add("창경궁");
		set.add("덕수궁");
		set.add("남대문 시장");
		set.add("창경궁");
		set.add("청계천");
		
		// 중복 불허
		System.out.println("크기 :" + set.size());
		
		// 인덱스 (순번: index)가 없음 ! => 순서(X)
		// 개별 요소 가져오기 힘듦 !
		// 전체 나열 가능 ! : 다음 방식 검색 (반복자(iterator) 패턴)
		
		Iterator<String> it = set.iterator();

		// for(;it.hasNext();)
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		for (String string : set) {
//			System.out.println(string);
//		}
		
//		set.forEach(x->System.out.println(x));
		set.forEach(System.out::println);
	}

}
