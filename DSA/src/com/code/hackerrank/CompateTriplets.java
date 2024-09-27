package com.code.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CompateTriplets {
	
	
	public static void main(String...args) {
		
		List<Integer> a = Arrays.asList(5,6,7);
		List<Integer> b = Arrays.asList(3,6,10);
		
		System.out.println(compareTriplets(a, b));
		
	}

	private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> resList = new ArrayList<>();
		int alice = 0;
		int bob = 0;
		
		for(int i= 0; i< a.size() && i <b.size(); i++) {
			if(a.get(i)-b.get(i)>0) {
				alice++;
			} else if(a.get(i)-b.get(i)<0) {
				bob++;
			}
		}
		resList.add(alice);
		resList.add(bob);
		
		return resList;
	}

}
