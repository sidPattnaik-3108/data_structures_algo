package com.code.stack;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		String[] token = { "1", "2", "+", "3", "*", "4", "-" };
		String[] token1 = { "4", "13", "5", "/", "+" };

		System.out.println(evalRPN(token));
		System.out.println(evalRPN(token1));

	}

	private static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		
		for(String s : tokens) {
			if("-".equals(s)) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b-a);
			} else if("+".equals(s)) {
				stack.push(stack.pop()+stack.pop());
			} else if("*".equals(s)) {
				stack.push(stack.pop()*stack.pop());
			} else if("/".equals(s)) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		return stack.pop(); 
	}

}
