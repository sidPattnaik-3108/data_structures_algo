package com.code.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {

	public static void main(String... args) {

		List<Integer> l1 = Arrays.asList(5, 3, 4);
		List<Integer> l2 = Arrays.asList(5, 3, 4);
		List<Integer> l3 = Arrays.asList(5, 3, 4);
		List<List<Integer>> sq = new ArrayList<>();
		sq.add(l1);
		sq.add(l2);
		sq.add(l3);
		System.out.println(formingMagicSquare(sq));
	}

	public static int formingMagicSquare(List<List<Integer>> s) {
		return 0;
	}

}
