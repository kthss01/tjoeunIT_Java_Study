package com.javateam.jse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Test27 {

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
		
//		System.out.println(set.contains("청계천"));
		
//		Object[] objArr = set.toArray();
//		for (Object o : objArr) {
//			System.out.println(o);
//		}
		
//		String[] strArr = set.toArray(new String[0]);
//		
//		for (String s : strArr) {
//			System.out.println(s);
//		}
		
//		set.stream().sorted().forEach(System.out::println);
		
//		SortedSet<String> set2 = new TreeSet<>();
		NavigableSet<String> set2 = new TreeSet<>();
		set2.add("광화문");
		set2.add("경복궁");
		set2.add("동소문");
		set2.add("남대문 시장");
		set2.add("덕수궁");
		set2.add("창경궁");
		set2.add("청계천");
		
//		set2.forEach(System.out::println);
		
		// 역순 정렬 :내림차순 정렬
//		set2.descendingIterator().forEachRemaining(System.out::println);
//		Iterator<String> it = set2.descendingIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// 내림차순 정렬
		set2.descendingSet().forEach(x->System.out.println(x));
	}

}
