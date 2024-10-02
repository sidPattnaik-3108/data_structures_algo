package com.code.sorting;

public class SelectionSort {
//4,2,3,6,1,9,5,8
	public int[] sort(int[] arr) {
		for(int i = 0; i< arr.length-1; i++) {
			int min_idx = i;
			for(int j = i+1; j< arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		return arr;
	}

}
