package com.code.fundamentals.linkedlist;

public class DoublyLinkedList {

	private static ListNode head;
	private static ListNode tail;
	private static int length;
	
	private static class ListNode {
		private ListNode previous;
		private int data;
		private ListNode next;
	
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		length = 0;
	}
	
	public static int length() {
		return length;
	}
	
	public static boolean isEmpty() {
		return length == 0;
	}
	
	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		displayForward();
		System.out.println();
		displayBackward();
		System.out.println();
		display(reverse(head));
		
	}

	private static void display(ListNode reversedNode) {
		if(reversedNode == null) {
			return;
		}
		ListNode temp = reversedNode;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
			temp = temp.next;
		}
		System.out.print("null");
		
	}

	private static ListNode reverse(ListNode llist) {
		if(llist == null) {
			return llist;
		}
		ListNode newNode = llist;
		while(llist.next!=null) {
			newNode.previous = llist.next;
			llist.next = newNode.previous.next; 
			newNode.previous.next = newNode;
			newNode = newNode.previous;
			
		}
		return newNode;
	}

	public static void addNode(int val) {
		ListNode newNode = new ListNode(val);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
		
	}
	
	private static void displayBackward() {
		
		if(tail == null) {
			return;
		}
		ListNode temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
			temp = temp.previous;
		}
		System.out.print("null");
		
	}

	private static void displayForward() {
		if(head == null) {
			return;
		}
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
			temp = temp.next;
		}
		System.out.print("null");
	}

}
