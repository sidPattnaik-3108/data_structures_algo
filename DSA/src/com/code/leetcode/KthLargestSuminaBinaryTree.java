package com.code.leetcode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestSuminaBinaryTree {
	private static TreeNode root;

	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		createTree();
		displayLevelOrdered(root);
		System.out.println();
		int k = 2;

		long res = kthLargestLevelSum(root, k);
		System.out.println(res);
	}

	private static void displayLevelOrdered(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}

	}

	private static void createTree() {
		root = new TreeNode(5);
		root.left = new TreeNode(8);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(1);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(7);
		root.left.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(6);
	}

	public static long kthLargestLevelSum(TreeNode root, int k) {

		if (root == null) {
			return -1;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		PriorityQueue<Long> pqueue = new PriorityQueue<>();

		queue.offer(root);
		while (!queue.isEmpty()) {
			long sum = 0;
			int depth = queue.size();
			
			while(depth>0) {
				TreeNode temp = queue.poll();
				sum = sum+temp.data;
				if(temp.left != null) {
					queue.offer(temp.left);
				}
				if(temp.right != null) {
					queue.offer(temp.right);
				}
				depth--;
			}
			pqueue.add(sum);
			if(pqueue.size()>k) {
				pqueue.poll();
			}
			
		}

		return pqueue.size() < k ? -1 : pqueue.peek();
	}

}
