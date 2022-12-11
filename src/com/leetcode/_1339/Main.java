package com.leetcode._1339;

class Main {

	public static void main(String[] args) {
		TreeNode root = null;

		root = new TreeNode(1, null, null);
		root.left = new TreeNode(2, null, null);
		root.right = new TreeNode(3, null, null);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);

		// displayElementsInBT(root);
		System.out.println(new Solution().maxProduct(root));
	}

	static void displayElementsInBT(TreeNode root) {
		try {
			System.out.println(root.val);
			displayElementsInBT(root.left);
			displayElementsInBT(root.right);
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}

}
