package com.code.linkedlist;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}
	
	public void add(int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			head = newNode;
		}else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}
	
	public void displayForward(ListNode head) {
		if(head == null) {
			return;
		}
		ListNode tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.data+"-->");
			tempNode = tempNode.next;
		}
		System.out.print("null");
	}
	
	public void displayBackward(ListNode tail) {
		if(tail == null) {
			return;
		}
		ListNode tempNode = tail;
		while(tempNode!=null) {
			System.out.print(tempNode.data+"-->");
			tempNode = tempNode.previous;
		}
		System.out.print("null");
	}
	
	

}
