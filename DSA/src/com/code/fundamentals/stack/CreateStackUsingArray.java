package com.code.fundamentals.stack;

import java.util.EmptyStackException;

public class CreateStackUsingArray {
	
	private final int MAX = 1000;
	private int top;
	private int a[] = new int[MAX];
	private int length;
	
	public CreateStackUsingArray() {
		top = -1;
		length = 0;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	private int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return a[top];
	}

	private void push(int data) {
		if(top>=MAX-1) {
			throw new StackOverflowError();
		}
		a[++top] = data;
		length++;
		
	}
	
	private int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int res = a[top--];
		length--;
		return res;
	}
	private void print() {
		for(int i = top ; i>-1;i--) {
			System.out.println(a[i]);
		}
		
	}

	
	public static void main(String[] args) {
		CreateStackUsingArray stack = new CreateStackUsingArray();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.print();
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());	
		stack.pop();
		System.out.println(stack.peek());	
		stack.pop();
		System.out.println(stack.peek());	
	}

}
