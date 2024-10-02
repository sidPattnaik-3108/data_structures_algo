package com.code.sorting;

public class BubbleSort {

	// 4,2,3,6,1,9,5,8
	public int[] sort(int[] arr) {
		boolean isSwapped;
		for(int i = 0; i< arr.length-1; i++) {
			isSwapped = false;
			for(int j = 0; j< arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr[j], arr[j+1]);
					isSwapped = true;
				}
			}
			if(!isSwapped) break;
		}
		return arr;
	}
	
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
