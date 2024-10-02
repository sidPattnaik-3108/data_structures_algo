package com.code.sorting;

public class SimpleSort {
//4,2,3,6,1,9,5,8
	public int[] sort(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
