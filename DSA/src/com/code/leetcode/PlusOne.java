package com.code.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 9 };
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	public static int[] plusOne(int[] digits) {
		System.out.println(Arrays.toString(digits));
		System.out.println(digits[digits.length-1]);
		for(int i = digits.length-1; i>0; i--) {
			if(digits[i]+1> 9) {
				digits[i] = 0;
				digits[i-1] = digits[i-1]+1;
			} else {
				digits[i]= digits[i]+1;
				break;
			}
			
		}
		return digits;
	}
}
