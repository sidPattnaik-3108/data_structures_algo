package com.code.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] arr = {1,1,2};
		arr = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}

}
