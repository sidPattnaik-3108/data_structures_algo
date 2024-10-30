package com.code.array;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arr = { 8, 7, 39, 31, 34, 4, 34, 35, 9 };

		System.out.println(findSecondLargest(arr));
	}

	private static int findSecondLargest(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (Integer i : arr) {
			if (i > max) {
				secondMax = max;
				max = i;
			} else if (i > secondMax && i != max) {
				secondMax = i;
			}
		}
		return secondMax;
	}

}
