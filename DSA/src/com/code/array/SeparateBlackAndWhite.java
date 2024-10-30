package com.code.array;

public class SeparateBlackAndWhite {
	
	public static void main(String[] args) {
		String s = "11000111";
		System.out.println(minimumSteps(s));
	}

	private static int minimumSteps(String s) {
		int count = 0;
		int j = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == '0' && s.charAt(j) != '0'){
				count++;
			}
			if(s.charAt(j) == '0') {
				j++;
			}
		}
		
		return count;
	}

}
