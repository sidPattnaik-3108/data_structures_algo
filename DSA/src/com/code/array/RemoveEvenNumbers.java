package com.code.array;

public class RemoveEvenNumbers {
	
	public static void main(String[] args) {
		int[] nums = {2, 4, 5, 8, 9, 11};
		
		removeEven(nums);
		
	}
	
	public static void removeEven(int[] arr) {
		int[] newArr = new int[arr.length];
		int j = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]%2!=0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		ArrayUtility arrayUtility = new ArrayUtility();
		arrayUtility.print(newArr);
	}

}
