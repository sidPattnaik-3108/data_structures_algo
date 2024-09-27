package com.code.linkedlist.fundamentals;

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String...args) {
		createLinkedList();
	}
	
	private static void createLinkedList() {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(1);
		sll.head.next = new ListNode(2);
		sll.head.next.next = new ListNode(3);
		sll.head.next.next.next = new ListNode(4);
		sll.head.next.next.next.next = new ListNode(5);
		sll.head.next.next.next.next.next = new ListNode(6);
		sll.head.next.next.next.next.next.next = new ListNode(7);
		display(sll.head);
		size(sll.head);
	}

	private static void display(ListNode head) {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private static void size(ListNode head) {
		ListNode current = head;
		int length = 0;
		while(current!=null) {
			length++;
			current = current.next;
		}
		System.out.println("Size of linked list is : "+length);
	}

}
