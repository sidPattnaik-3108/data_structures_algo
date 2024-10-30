package com.code.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(factorial(n));
	}

	private static int factorial(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

}
