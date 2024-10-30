package com.code.leetcode;

public class HeightOfBTAfterSubtreeRemoval2 {
	/**
	 * Definition for a binary tree node.
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	int[] preOrderArr = new int[Integer.MAX_VALUE];
	int[] postOrderArr = new int[Integer.MAX_VALUE];
	int maxHeight = 0;

	public int[] treeQueries(TreeNode root, int[] queries) {
		
		preOrderTraversal(root, 0);
		maxHeight = 0;
		postOrderTraversal(root, 0);
		int[] result = new int[queries.length];
		for(int i = 0; i< result.length; i++) {
			result[i] = Math.max(preOrderArr[queries[i]], postOrderArr[queries[i]]);
		}
		
		return result;
	}

	private void postOrderTraversal(TreeNode root, int height) {
		if(root == null) {
			return;
		}
		postOrderArr[root.val] = maxHeight;
		maxHeight = Math.max(maxHeight, height);
		
		postOrderTraversal(root.right, height+1);
		postOrderTraversal(root.left, height+1);
		
	}

	private void preOrderTraversal(TreeNode root, int height) {
		if(root == null) {
			return;
		}
		preOrderArr[root.val] = maxHeight;
		maxHeight = Math.max(maxHeight, height);
		
		preOrderTraversal(root.left, height+1);
		preOrderTraversal(root.right, height+1);
		
		
	}

}
