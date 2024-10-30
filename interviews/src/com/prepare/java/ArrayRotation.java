package com.prepare.java;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5 };
		int point = 2;
		int[] finalArr = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			finalArr[(i+point)%arr.length] = arr[i];
		}
		System.out.println(Arrays.toString(finalArr));
	}

}
