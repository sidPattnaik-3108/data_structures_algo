package com.code.tree;

//Binary Search Tree
public class BST {

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
		BST tree = new BST();
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
		System.out.println();
		if (null != tree.search(99)) {
			System.out.println("Key Found!!!");
		} else {
			System.out.println("Key Not Found!!!");
		}
	}

	private TreeNode search(int val) {
		return search(root, val);
	}

	private TreeNode search(TreeNode root, int key) {
		if (root == null || root.data == key) {
			return root;
		}
		if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}

	}
}
