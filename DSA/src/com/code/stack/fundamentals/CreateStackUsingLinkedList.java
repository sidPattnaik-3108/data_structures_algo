package com.code.stack.fundamentals;

import java.util.EmptyStackException;

public class CreateStackUsingLinkedList {
	
	private static ListNode top;
	private static int length;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public CreateStackUsingLinkedList() {
		length = 0;
		top = null;
	}
	
	public static int size() {
		return length;
	}
	
	public static boolean isEmpty() {
		return length==0;
	}
	
	public static void main(String[] args) {
		
		push(10);
		push(20);
		push(30);
		
		
		System.out.println(peek());
		System.out.println(pop());
		System.out.println(peek());
		
	}

	private static void push(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = top;
		top = newNode;
		length++;
	}

	private static int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
		
	}

	public static int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		ListNode resNode = top;
		top = top.next;
		length--;
		return resNode.data;
		
	}
}
