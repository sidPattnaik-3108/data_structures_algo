package com.code.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LongestSqueareStreak {

	public static void main(String[] args) {

	}

//	4,3,6,16,8,2

	public int longestSquareStreakBruteForce(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int sqCount = 0;
			int square = nums[i] * nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (square == nums[j]) {
					sqCount++;
					square = nums[j] * nums[j];
				}
			}
			count = Math.max(count, sqCount);
		}
		return count == 0 ? -1 : count + 1;
	}

	public int longestSquareStreakOptimized(int[] nums) {
		Set<Integer> set = new LinkedHashSet<>();

		for (int num : nums) {
			set.add(num);
		}
		List<Integer> list = new ArrayList<>(set);
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			int sqCount = 0;
			long ref = list.get(i);
			while (set.contains((int) (ref * ref))) {
				sqCount++;
				ref = ref * ref;
			}

			count = Math.max(count, sqCount);
		}
		return count == 0 ? -1 : count + 1;
	}

}
