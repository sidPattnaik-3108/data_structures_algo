package com.prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LambdaExpression {

	public boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	interface PerformOperation {
		public boolean check(int num);
	}

	public static void main(String[] args) throws IOException {
		LambdaExpression ob = new LambdaExpression();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}

	private PerformOperation isPrime() {
		return number -> {
			if (number <= 1)
	            return false;

	        // Check from 2 to n-1
	        for (int i = 2; i < number; i++)
	            if (number % i == 0)
	                return false;

	        return true;
		};
	}

	private PerformOperation isPalindrome() {
		return number-> {
			String numStr = String.valueOf(number);
			String revStr = new StringBuilder(numStr).reverse().toString();
			return numStr.equals(revStr);
		};
	}

	private PerformOperation isOdd() {
		
		return number->number%2!=0;
	}

}
