package com.code.leetcode;

import java.util.Stack;

public class AddTwoNumbers {

	private static ListNode l1;
	private static ListNode l2;

	private static ListNode finalList;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		addTwoNumbers(l1, l2);

		l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next = new ListNode(9);

		l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);

		addTwoNumbers(l1, l2);

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		finalList = new ListNode(0);
		int carry = 0;
		while (l1 != null && l2 != null) {

			int sum = carry + l1.data + l2.data;
			carry = extracted(sum);
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {

			int sum = carry + l1.data;
			carry = extracted(sum);
			l1 = l1.next;
		}

		while (l2 != null) {

			int sum = carry + l2.data;
			carry = extracted(sum);
			l2 = l2.next;
		}

		return finalList.next;
	}

	private static int extracted(int sum) {
		append(sum % 10);
		return sum / 10;
	}

	private static void append(Integer data) {
		ListNode newNode = new ListNode(data);
		if (finalList == null) {
			finalList = newNode;
			return;
		}
		ListNode last = finalList;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

}
