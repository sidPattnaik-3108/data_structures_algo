package com.code.stack;

import java.util.Stack;

public class ValidPrenathesis {
	public static void main(String[] args) {
		String str = "(])";
		String str1 = "({[]})";
		String str2 = "({[])";
		String str3 = "(][)";
		String str4 = ")](])";
		String str5 = "{{{{{{{}}}}}}}";
		String str6 = "({sTrTs})";
		
		System.out.println(validPrenthesis(str));
		System.out.println(validPrenthesis(str1));
		System.out.println(validPrenthesis(str2));
		System.out.println(validPrenthesis(str3));
		System.out.println(validPrenthesis(str4));
		System.out.println(validPrenthesis(str5));
		System.out.println(validPrenthesis(str6));
	}
	private static boolean validPrenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(Character c : str.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else {
                if(stack.isEmpty()) { 
                    return false;
                }
                if(   (stack.peek() == '{' && c == '}')
                    ||(stack.peek() == '[' && c == ']')
                    ||(stack.peek() == '(' && c == ')')){
                    stack.pop();
                } else {
                	stack.push(c);
                }
            }
        }
        return stack.isEmpty();
	}

}
