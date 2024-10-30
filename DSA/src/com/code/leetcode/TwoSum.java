package com.code.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 22;
		
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
		
		
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[] {i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return null;
		
	}
	
	

}
