package com.code.array;

public class FindMissingNumber {
	
	
	public static int findMissing(int[] arr) {
		int n = arr.length+1;
		//+1 is because one element is missing in the array
		int total = (n*(n+1))/2;
		for(Integer i : arr) {
			total -= i;
		}
		return total;
	}
	
	public static void main(String...args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
		System.out.println(findMissing(arr));
	}

}
