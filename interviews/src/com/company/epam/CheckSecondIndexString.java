package com.company.epam;

import java.util.ArrayList;
import java.util.List;

public class CheckSecondIndexString {
	public static void main(String[] args) {
		//print the numbers whose 2nd digit it 1;
		int[] arr = new int[] {1, 21, 321, 5124, 11111, 4333333};
		System.out.println(checkSecondDigit(arr));
	}

	private static List<Integer> checkSecondDigit(int[] arr) {
		List<Integer> resList = new ArrayList<>();
		for(Integer i : arr) {
			String numString = String.valueOf(i);
			if(numString.length()>1 && numString.charAt(1) == '1') {
				resList.add(i);
			}
		}
		return resList;
	}

}
