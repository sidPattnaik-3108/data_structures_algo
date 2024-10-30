package com.code.array;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr = {};
		int[] brr = {1};

		System.out.println(Arrays.toString(mergeArrays(arr, brr)));
	}

	private static int[] mergeArrays(int[] arr, int[] brr) {
		int[] resArr = new int[arr.length + brr.length];
		int i = 0;// arr
		int j = 0;// brr
		int k = 0;// resArr
		while (i < arr.length && j < brr.length) {
			if (arr[i] < brr[j]) {
				resArr[k] = arr[i];
				i++;
			} else {
				resArr[k] = brr[j];
				j++;
			}
			k++;
		}
		while (i < arr.length) {
			resArr[k] = arr[i];
			i++;
			k++;
		}
		while (j < brr.length) {
			resArr[k] = brr[j];
			j++;
			k++;
		}
		return resArr;
	}

}
