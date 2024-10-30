package com.code.tree;

public class MaximumValue {

	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	private void createTree() {
		root = new TreeNode(11);
		root.left = new TreeNode(12);
		root.right = new TreeNode(13);
		root.left.left = new TreeNode(14);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(16);
	}

	public static void main(String[] args) {
		MaximumValue tree = new MaximumValue();
		tree.createTree();

		System.out.println(findMax(tree.root));

	}

	private static int findMax(TreeNode root) {

		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int max = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);

		if (left < right) {
			max = right;
		}
		if (right < left) {
			max = left;
		}

		return max;

	}

}
