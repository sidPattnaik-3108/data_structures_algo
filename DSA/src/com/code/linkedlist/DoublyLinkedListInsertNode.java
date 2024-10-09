package com.code.linkedlist;

public class DoublyLinkedListInsertNode {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode {
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedListInsertNode() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int size() {
		return length;
	}
	

	private void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	private void insertPrevious(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
		
	}

	private void printList() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public static void main(String[] args) {
		DoublyLinkedListInsertNode dll = new DoublyLinkedListInsertNode();
		dll.insertLast(10);
		dll.insertLast(11);
		dll.insertLast(12);
		dll.insertLast(13);
		dll.insertLast(14);
		dll.insertLast(15);
		
		dll.printList();
		dll.insertPrevious(21);
		dll.insertPrevious(22);
		dll.insertPrevious(23);
		dll.insertPrevious(24);
		
		System.out.println();
		dll.printList();
		
	}

}
