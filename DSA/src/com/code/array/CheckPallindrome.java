package com.code.array;

public class CheckPallindrome {

	public static void main(String[] args) {
		String str = "akas";

		System.out.println(checkPallindrome(str));
	}

	private static boolean checkPallindrome(String str) {

		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

}
