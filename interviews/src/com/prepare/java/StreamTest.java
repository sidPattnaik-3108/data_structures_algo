package com.prepare.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);

		List<Integer> duplicates = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().filter(map->map.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicates);
	}

}
