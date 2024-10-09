package com.company.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintFourthLargestString {
	
	public static void main(String[] args) {
		String str = "I am here for the Interview";
		
		Map<Object, List<String>> stringMap = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s.length(), Collectors.toList()));
		System.out.println(stringMap.get(stringMap.keySet().stream().skip(3).findFirst().get()));
		
	}

}
