package com.company.oracle;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		
		System.out.println(checkRotation(s1, s2));
	}

	private static boolean checkRotation(String s1, String s2) {
		if(s1.isEmpty() || s1.length()!=s2.length()) {
			return false;
		}
		String str = s1+s1;
		return str.contains(s2);
	}
}
