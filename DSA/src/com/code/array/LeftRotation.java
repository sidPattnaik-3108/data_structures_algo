package com.code.array;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int d = 2;
		
		System.out.println(rotate(arr, d));
	}

	private static List<Integer> rotate(int[] arr, int d) {
		int[] newArr = new int[arr.length * 2];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			newArr[k] = arr[i];
			k++;
		}
		for (int i = 0; i < arr.length; i++) {
			newArr[k] = arr[i];
			k++;
		}
		List<Integer> resList = new ArrayList<>();
		
		for(int i = d; i<d+arr.length; i++) {
			resList.add(newArr[i]);
		}

		return resList;
	}

}
