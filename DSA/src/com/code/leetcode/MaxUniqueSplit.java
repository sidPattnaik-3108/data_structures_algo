package com.code.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaxUniqueSplit {

	public static void main(String[] args) {
		String s = "abaccc";
		System.out.println(maxUniqueSplit(s));
	}

	public static int maxUniqueSplit(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		if ((s.length() == 1) || (s.length() == 2 && s.split("")[0] == s.split("")[1])) {
			return 1;
		}

		int splits = checkSplits(0, s, new HashSet<>());

		return splits;

	}

	private static int checkSplits(int first, String s, Set<String> set) {
		int result = 0;
		for (int i = first + 1; i <=s.length(); i++) {
			String subStr = s.substring(first, i);
			
			if(!set.contains(subStr)) {
				set.add(subStr);
				int splits = 1+checkSplits(i, s, set);
				
				result = Math.max(splits, result);
				set.remove(subStr);
			}
		}
		return result;
	}

}
