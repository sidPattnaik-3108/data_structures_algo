package com.code.leetcode;

public class ValidateBst {

	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void insert(int value) {
		root = insertNode(root, value);
	}

	private TreeNode insertNode(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (root.data > value) {
			root.left = insertNode(root.left, value);
		} else {
			root.right = insertNode(root.right, value);
		}

		return root;
	}

	private void inOrder(TreeNode root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	public static void main(String[] args) {
		ValidateBst tree = new ValidateBst();
		tree.insert(10);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);
		tree.insert(7);
		tree.insert(5);
		tree.insert(9);
		tree.insert(2);
		tree.insert(4);

		tree.inOrder(tree.root);
		System.out.println(tree.isValidBST(tree.root));
		
	}

	public boolean isValidBST(TreeNode root) {
		return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValid(TreeNode root, long min, long max) {
		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data >= max) {
			return false;
		}
		boolean left = isValid(root.left, min, root.data);
		if (left) {
			boolean right = isValid(root.right, root.data, max);
			return right;
		}
		return false;
	}

}
