package com.prepare.java;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceMap {
	
	public static void main(String[] args) {
		String str = "Interview";
		
//		return  {I:1, n:1, t:1, e:2, r:1, v:1, i:1, w:1}
		
		Map<Object, Long> resMap = Arrays.stream(str.toLowerCase().split("")).collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(resMap);
	}

}
