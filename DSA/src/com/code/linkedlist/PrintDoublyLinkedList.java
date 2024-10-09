package com.code.linkedlist;

public class PrintDoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public PrintDoublyLinkedList() {
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
	
	
	//insert data to DLL;
	private void addNode(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}
	
	private void printForward() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null");
	}
	
	private void printBackward() {
		if(tail == null) {
			return;
		}
		ListNode current = tail;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.previous;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		PrintDoublyLinkedList dll = new PrintDoublyLinkedList();
		dll.addNode(10);
		dll.addNode(11);
		dll.addNode(12);
		dll.addNode(13);
		dll.addNode(14);
		System.out.println(dll.size());
		dll.printForward();
		System.out.println();
		dll.printBackward();
		
	}

}
