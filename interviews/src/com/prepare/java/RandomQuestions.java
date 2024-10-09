package com.prepare.java;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RandomQuestions {

	public static void main(String[] args) {

		var set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, Set<Integer>> partitioned = partitionEvenOdds(set);
		System.out.println(partitioned);
	}

	private static Map<Boolean, Set<Integer>> partitionEvenOdds(Set<Integer> set) {
		return set.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toSet()));
	}
	
//	true: [2,4,6,8] false:[1,3,5,7,9]
			

}
