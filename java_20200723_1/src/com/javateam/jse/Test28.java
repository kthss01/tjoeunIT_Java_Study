package com.javateam.jse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test28 {
	public static void main(String[] args) {

		String[] strArr = { "청계천", "창경궁", "동소문", "덕수궁", "남대문  시장", "광화문", "경복궁" };

		List<String> strList = Arrays.asList(strArr);
//		strList.sort(Comparator.naturalOrder());
//		strList.sort(Comparator.reverseOrder());
//		strList.forEach(System.out::println);

//		Arrays.asList(strArr)
//			  .stream()
//			  .sorted()
//			  .sorted(Comparator.reverseOrder())
//			  .forEach(System.out::println);

		List<String> list = Arrays.asList(strArr);
//		list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
////				return o1.compareTo(o2); // 오름차순
//				return o2.compareTo(o1); // 내림차순
//			}
//		});
		
//		Collections.sort(list);
//		Collections.sort(list, Comparator.reverseOrder());
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
//				return o1.compareTo(o2); // 오름차순
				return o2.compareTo(o1); // 내림차순
			}
		});
		
		list.forEach(System.out::println);
	}
}
