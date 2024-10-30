package com.code.leetcode;

public class MaximumSwap {

	public int maximumSwap(int num) {
		char[] arr = String.valueOf(num).toCharArray();
		// Track the last occurrence of each digit (0-9)
		int[] brr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			brr[arr[i] - '0'] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			// Check if we can find a larger digit to swap
			for (int j = 9; j > arr[i] - '0'; j--) {
				if (brr[j] > i) {
					char temp = arr[i];
					arr[i] = arr[brr[j]];
					arr[brr[j]] = temp;
					return Integer.parseInt(new String(arr));
				}
			}
		}

		// Return the original number if no swap occurred
		return num;
	}

	public static void main(String[] args) {
		MaximumSwap ms = new MaximumSwap();

		System.out.println(ms.maximumSwap(2736));

	}

}
