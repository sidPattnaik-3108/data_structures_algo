package com.code.sorting;

public class BubbleSort {

	// 4,2,3,6,1,9,5,8
	public int[] sort(int[] arr) {
		boolean isSwapped;
		for(int i = 0; i< arr.length-1; i++) {
			isSwapped = false;
			for(int j = 0; j< arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false) break;
		}
		return arr;
	}
	
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
