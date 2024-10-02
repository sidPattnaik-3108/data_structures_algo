package com.code.searching;

public class SearchInsertPosition {
	
	
	
	public static void main(String[] args) {
		int[] nums = {2, 4, 5, 8, 9, 11};
		int target = 19;

		long startTime = System.currentTimeMillis();
		System.out.println(searchInsertPosition(nums, target));//O(N)
		long endtime = System.currentTimeMillis();
		System.out.println("O(N): "+(endtime-startTime));
		
		long startTime2 = System.currentTimeMillis();
		System.out.println(searchInsertPosition2(nums, target));//O(log N)
		long endTime2 = System.currentTimeMillis();
		System.out.println("O(log N): "+(endTime2-startTime2));
	}

	private static int searchInsertPosition(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]>=target) return i;
		}
		return nums.length;
	}

	private static int searchInsertPosition2(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return end+1;
	}

}
