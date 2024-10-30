package com.code.tree;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class BinaryTree {

	private static TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	private void createBinaryTree() {
		root = new TreeNode(11);
		root.left = new TreeNode(12);
		root.right = new TreeNode(13);
		root.left.left = new TreeNode(14);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(16);

	}

	private void postOrderRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data + " ");

	}

	private void inOrderRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderRecursive(root.left);
		System.out.print(root.data + " ");
		inOrderRecursive(root.right);

	}

	private void preOrderRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);

	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.createBinaryTree();
		System.out.println();
		System.out.println("Recursive: ");
		System.out.print("Pre Order Recursive: ");
		tree.preOrderRecursive(root);
		System.out.println();
		System.out.print("In Order Recursive: ");
		tree.inOrderRecursive(root);
		System.out.println();
		System.out.print("Post Order Recursive: ");
		tree.postOrderRecursive(root);
		System.out.println();
		System.out.print("Level Order Recursive: ");
		tree.postOrderRecursive(root);

		System.out.println();
		System.out.println("Iteravive: ");
		System.out.print("Pre Order Iteravive: ");
		tree.preOrderIterative(root);
		System.out.println();
		System.out.print("In Order Iteravive: ");
		tree.inOrderIterative(root);
		System.out.println();
		System.out.print("Post Order Iteravive: ");
		tree.postOrderIterative(root);
		System.out.println();
		System.out.print("Level Order: ");
		tree.levelOrder(root);

	}

	private void levelOrder(TreeNode root) {
		Set<Integer> set = new TreeSet<>();
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			set.add(temp.data);
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}
		
		int secondMax = set.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Max = "+secondMax);
	}

	private void preOrderIterative(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}

	}

	private void inOrderIterative(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (temp != null || !stack.isEmpty()) {
			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}

	private void postOrderIterative(TreeNode root) {
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();

		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;

				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} else {
					current = temp;
				}
			}
		}

	}

}
