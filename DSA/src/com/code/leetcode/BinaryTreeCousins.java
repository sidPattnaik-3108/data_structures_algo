package com.code.leetcode;

public class BinaryTreeCousins {

	private static TreeNode root;

	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static TreeNode insertBSTData(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}
		if (root.data < data) {
			root.right = insertBSTData(root.right, data);
		} else {
			root.left = insertBSTData(root.left, data);
		}
		return root;
	}

	private static void displayInOrder(TreeNode root) {

		if (root == null) {
			return;
		}

		displayInOrder(root.left);
		System.out.print(root.data + " ");
		displayInOrder(root.right);

	}

	public static void main(String[] args) {

		insert(60);
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(70);
		insert(50);

		displayInOrder(root);
	}

	private static void insert(int data) {

		root = insertBSTData(root, data);

	}

}
