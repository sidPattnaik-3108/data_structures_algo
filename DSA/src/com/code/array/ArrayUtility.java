package com.code.array;

public class ArrayUtility {

	public void print(int[] arr) {
		for (Integer i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	public int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}

	public int secondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}

	public void reverse(int[] arr) {
		if (arr.length == 0)
			throw new IllegalArgumentException("Cannot reverse an empty array");

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public int[] resize(int[] arr, int newSize) {
		
		int[] tempArr = new int[newSize];
		for(int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
		return arr;
	}

}
