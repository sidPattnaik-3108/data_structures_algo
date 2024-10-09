package com.code.fundamentals.queue;

import java.util.NoSuchElementException;

public class QueueConcepts {

	private ListNode front;
	private ListNode rear;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int size() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}
	
	public QueueConcepts() {
		this.length = 0;
		this.front = null;
		this.rear = null;
	}
	
	public int first() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		return front.data;
	}
	
	public int last() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		return rear.data;
	}

	public void enqueue(int data) {
		ListNode newNode = new ListNode(data);
		
		if(isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}
	
	
	private int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length--;		
		return result;
		
	}
	
	private void display() {
		if(isEmpty()) {
			return;
		}
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.print("null");
		
	}

	public static void main(String[] args) {

		QueueConcepts queue = new QueueConcepts();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(23);
		System.out.println(queue.first());
		System.out.println(queue.last());
		queue.display();
		System.out.println();
		System.out.println(queue.dequeue());
		
		queue.display();
		
		System.out.println();
		System.out.println(queue.first());
		System.out.println(queue.last());

	}

}
