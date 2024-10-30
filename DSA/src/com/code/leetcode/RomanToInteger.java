package com.code.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "LVIII";// 1989

		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		int val = 0;
		int sum = 0;
		int preVal = 0;
		for (int i = s.length()-1; i>=0; i--) {
			switch (s.split("")[i]) {
			case "I":
				val = 1;
				break;
			case "V":
				val = 5;
				break;
			case "X":
				val = 10;
				break;
			case "L":
				val = 50;
				break;
			case "C":
				val = 100;
				break;
			case "D":
				val = 500;
				break;
			case "M":
				val = 1000;
				break;
			}
			if (val < preVal) {
				sum = sum - val;
			} else {
				sum = sum + val;
			}
			preVal = val;
		}
		return sum;
	}
}
