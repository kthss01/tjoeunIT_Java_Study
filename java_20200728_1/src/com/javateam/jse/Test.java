package com.javateam.jse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// 최대 최소 값 구하기
		int max, min;
		max = numList.isEmpty() ? -1 : Collections.max(numList);
		min = numList.isEmpty() ? -1 : Collections.min(numList);
		
		max = numList.stream().max(Integer::compare).orElse(-1);
		max = numList.stream().max((x,y)->Integer.compare(x, y)).orElse(-1);
		min = numList.stream().min(Integer::compare).orElse(-1);
		min = numList.stream().min(Integer::compare).orElse(-1);
		
		System.out.println(min + " " + max);
	}
}
