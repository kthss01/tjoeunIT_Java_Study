package com.javateam.jse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test29 {
	public static void main(String[] args) {

		String[] strArr = { "청계천", "창경궁", "동소문", "덕수궁", "남대문  시장", "광화문", "경복궁" };

		Arrays.sort(strArr);

//		for (String string : strArr) {
//			System.out.println(string);
//		}

		////////////////////////////////////////////////////

		NavigableSet<String> set = new TreeSet<>();
		set.add("광화문");
		set.add("경복궁");
		set.add("동소문");
		set.add("남대문 시장");
		set.add("덕수궁");
		set.add("창경궁");
		set.add("청계천");

//		set.subSet("강나루", "선릉").forEach(System.out::println);
//		set.subSet("강나루", "박물관").forEach(System.out::println);
//		set.subSet("청계천", "광화문").forEach(System.out::println); // test 해보니 (X)
//		set.subSet("경복궁", false, "박물관", true).forEach(System.out::println);
		
//		set.headSet("박물관").forEach(System.out::println);
//		set.tailSet("박물관").forEach(System.out::println);
		
//		System.out.println(set.pollFirst()); // 처음값
//		System.out.println(set.pollLast()); // 마지막값
		
		// Set ==> List
//		List<?> list = (List<Object>)set; // 바로 안됨 (X)
//		List<?> list = Arrays.asList(set.toArray()); // ? 와일드카드라고함
//		List<? extends Object> list = Arrays.asList(set.toArray()); // 한정 할 수 있음
		List<? extends Object> list = Arrays.asList(set.toArray(new String[0])); // 한정 할 수 있음

//		list.forEach(System.out::println);
		
		// random하게 셔플해주는 method
		Collections.shuffle(list); // 그 때 그 때마다(실행할 때마다, 호출될 때마다) 다르게 섞어줌
		list.forEach(System.out::println);
	}
}
