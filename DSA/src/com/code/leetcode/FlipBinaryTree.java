package com.code.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FlipBinaryTree {

	private TreeNode root;

	private class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	private void insertNode() {
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(8);
	}

	private List<Integer> displayLevelOrdered(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return new ArrayList<>();
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.val + " ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}
		return list;
	}

	private List<Integer> displayFlippedLeveledOrder(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return new ArrayList<>();
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.val + " ");
			list.add(temp.val);
			if (temp.right != null) {
				queue.offer(temp.right);
			}
			if (temp.left != null) {
				queue.offer(temp.left);
			}
		}
		return list;
	}

	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null || root1.val != root2.val)
			return false;

		return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right))
				|| (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
	}

	public static void main(String[] args) {
		FlipBinaryTree tree = new FlipBinaryTree();
		tree.insertNode();
		tree.displayLevelOrdered(tree.root);
		System.out.println();
		tree.displayFlippedLeveledOrder(tree.root);
	}
}
