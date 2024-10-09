package com.code.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedListDeleteNode {
	
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
	
	public DoublyLinkedListDeleteNode() {
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
	
	private void display() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null");
	}

	private void addNode(int data) {
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
	private void deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(tail == head) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		length--;
		
	}

	private void deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		length--;
	}
	
	public static void main(String[] args) {
		DoublyLinkedListDeleteNode dll = new DoublyLinkedListDeleteNode();
		dll.addNode(10);
		dll.addNode(11);
		dll.addNode(12);
		dll.addNode(13);
		dll.addNode(14);
		dll.display();
		System.out.println();
		dll.deleteFirst();
		dll.display();
		System.out.println();
		dll.deleteLast();
		dll.display();
	}
}
