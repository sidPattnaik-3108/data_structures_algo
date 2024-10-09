package com.company.oracle;

public class PerfectSquare {

	public static void main(String[] args) {
		int n = 64;
		System.out.println(checkPerfectSquare(n));
	}

	private static boolean checkPerfectSquare(int n) {

		for(int i = 1; i*i<=n; i++) {
			if(n%i == 0/**REMAINDER*/ && n/i == i/**QUOTIENT*/) {
				return true;
			}
		}
		return false;
	}
}
