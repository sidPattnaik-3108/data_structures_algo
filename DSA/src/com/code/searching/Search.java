package com.code.searching;

public class Search {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 5, 8, 9, 11, 12 };

		System.out.println(linearSearch(nums, 11));
		System.out.println(binarySearch(nums, 1));
	}

	private static boolean binarySearch(int[] nums, int val) {
		int l = 0;
		int r = nums.length -1;
		
		while(l <= r) {
			int mid = (r+l)/2;
			if(val == nums[mid]) {
				return true;
			} else if(val<nums[mid] && val>nums[l]) {
				r = mid-1;
			} else {
				l = mid+1;
			}
		}
		return false;
	}

	private static boolean linearSearch(int[] arr, int val) {
		for (Integer i : arr) {
			if (i == val)
				return true;
		}
		return false;
	}

}
