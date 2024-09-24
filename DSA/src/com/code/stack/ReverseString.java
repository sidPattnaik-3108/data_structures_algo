package com.code.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
	
	private static String reverseString(String str) {
		
		Stack<Character> stack = new Stack<>();
		char[] res = new char[str.length()];
		for(Character ch : str.toCharArray()) {
			stack.push(ch);
		}
		for(int i = 0; i<res.length; i++) {
			if(!stack.isEmpty()) {
				res[i] = stack.pop();
			}
		}
		
		return String.valueOf(res);
	}
	public static void main(String...args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scanner.next();
		System.out.println("Reversed String : "+reverseString(str));
		scanner.close();
		
	}

}
