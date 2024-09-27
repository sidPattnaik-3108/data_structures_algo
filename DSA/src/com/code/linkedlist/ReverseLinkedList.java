package com.code.linkedlist;

public class ReverseLinkedList {
	
	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;
	private int length;
	
	private class DoublyLinkedListNode{
		private int data;
		private DoublyLinkedListNode next;
		private DoublyLinkedListNode previous;
		
		public DoublyLinkedListNode(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}
	
	public ReverseLinkedList() {
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
	//null<=>1<=>2<=>3<=>4<=>null;
	public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
	    if(llist==null) {
	    	return llist;
	    }
	    DoublyLinkedListNode tempNode = llist;
	    DoublyLinkedListNode newNode = null;
	    while(tempNode!=null) {
	    	newNode = tempNode;
	    	newNode.next = tempNode.previous;
	    	newNode.previous = tempNode.next;
	    	tempNode = tempNode.next;
	    	tempNode.next = null;
	    }
		
		return newNode;
	}

}
