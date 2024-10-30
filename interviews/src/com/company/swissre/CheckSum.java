package com.company.swissre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckSum {

	public static void main(String[] args) {
		int[] arr = { 193, 254, 56, 111, 918, 2456 };// 25
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += findMidSum(arr[i]);
		}
		System.out.println(sum);
	}

	private static int findMidSum(int num) {
		List<Integer> digits = new ArrayList<>();
		while (num != 0) {
			digits.add(num % 10);
			num = num / 10;
		}
		Collections.sort(digits);
//		digits.subList(1, digits.size()-1);
		digits.remove(0);
		digits.remove(digits.size() - 1);
		if (digits.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for (Integer digit : digits) {
			sum += digit;
		}
		return sum;
	}

}
