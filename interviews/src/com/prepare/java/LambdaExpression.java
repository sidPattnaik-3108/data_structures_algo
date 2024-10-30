package com.prepare.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

	public static void main(String[] args) {
		String str = "Siddhant";
		List<Integer> lst = Arrays.asList(1, 10, 15, 10, 12, 5, 10, 20);
		int n = 10;
		
		System.out.println(checkAlphabets(str));
		
		System.out.println(removeElementFromList(lst, n));

	}

	private static List<Integer> removeElementFromList(List<Integer> lst, int n) {
		List<Integer> resList = lst.stream().filter(l->l!=n).collect(Collectors.toList());
		return resList;
	}

	private static boolean checkAlphabets(String str) {
		return (null != str && !str.isEmpty() ? str.chars().allMatch(Character::isLetter) : false);

	}
}
