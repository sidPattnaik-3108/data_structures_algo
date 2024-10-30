package com.code.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flower","flower","flower"};
		System.out.println(longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) {
			return "";
		}
		if(strs.length == 1) {
			return strs[0];
		}
		
		String ref = strs[0];
		String res = "";
		
		int j = 1;
		
		while(j<=ref.length()) {
			int count = 0;
			for(int i =1; i<strs.length; i++) {
				if(strs[i].startsWith(ref.substring(0, j))) {
					count++;
				}
			}
			if(count == strs.length-1) {
				res = ref.substring(0, j);
				j++;
			} else {
				break;
			}
			
		}
		
		return res;
	}

}
