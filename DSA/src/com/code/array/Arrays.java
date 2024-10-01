package com.code.array;

public class Arrays {

	public static void main(String[] args) {
		// Array Functionalities
		int[] arr = { 1, 4, 2, 9, 6, 3, 8 };

		ArrayUtility arrayUtility = new ArrayUtility();

		arrayUtility.print(arr);

		System.out.println("Max in array: " + arrayUtility.max(arr));

		System.out.println("Min in array: " + arrayUtility.min(arr));

		System.out.println("Second max in array: " + arrayUtility.secondMax(arr));

		arrayUtility.reverse(arr);

		arrayUtility.print(arr);

		arr = arrayUtility.resize(arr, 10);

		System.out.println(arr.length);
		
	}
}
