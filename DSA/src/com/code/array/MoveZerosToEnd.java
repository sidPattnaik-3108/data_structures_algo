package com.code.array;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 13, 0, 4, 3 };
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void moveZeros(int[] arr) {
		int j = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!= 0 && arr[j]==0) {
				swap(arr, i, j );
			} 
			// j = 1 13 0 0 4 3
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	

}
