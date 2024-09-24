package com.code.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String...args) {
		int[] a = {6,9,1,3,8,3,1,10};
		
		int[] res = nextGreaterElement(a);
		
		System.out.println("Result array: "+Arrays.toString(res));
	}

	private static int[] nextGreaterElement(int[] a) {
		
		int[] res = new int[a.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = a.length-1; i>=0; i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty()
						&& stack.peek()<=a[i]) {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = stack.peek();
			}
			
			stack.push(a[i]);

		}
		
		return res;
	}
}
