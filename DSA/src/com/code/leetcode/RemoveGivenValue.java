package com.code.leetcode;

import java.util.Arrays;

public class RemoveGivenValue {
	
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		int l = 0;
		int r = 0;
		int n = nums.length;
		while(r<n) {
			if(nums[r]!=val) {
				nums[l] = nums[r];
				l++;
			}
			r++;
		}
//		String hayStack = "hayStack";
		System.out.println(Arrays.toString(nums));
	}
	
}
