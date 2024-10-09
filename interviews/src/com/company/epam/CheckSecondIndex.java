package com.company.epam;

import java.util.ArrayList;
import java.util.List;

public class CheckSecondIndex {
	public static void main(String[] args) {
		//print the numbers whose 2nd digit it 1;
		int[] arr = new int[] {1, 21, 321, 5124, 11111, 4333333};
		
		System.out.println(checkSecondDigit(arr));
	}

	private static List<Integer> checkSecondDigit(int[] arr) {
		List<Integer> resList = new ArrayList<>();
		for(Integer i : arr) {
			if(checkSecondDigit(i)) {
				resList.add(i);
			}
		}
		return resList;
	}

	private static boolean checkSecondDigit(int num) {
		while(num>=100) {
			num = num/10; 
		}
		return (num>10 && num%10 == 1);
	}

}
