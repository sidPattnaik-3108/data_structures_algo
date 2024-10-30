package com.company.tr;

import java.util.HashMap;
import java.util.Map;

public class SubArrayForTarget {
	public static void main(String[] args) {
		int[] arr = {2, 3, 6, 1, 9, 11};
		int target = 9;
		
		findSubArray(arr, target);
	}

	private static void findSubArray(int[] arr, int target) {
		Map<Integer, Integer> map= new HashMap<>();
		for(int i = 0; i< arr.length; i++) {
			map.put(arr[i],i);
		}
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			
		}
		
	}

}
