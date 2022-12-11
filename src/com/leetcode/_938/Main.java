package com.leetcode._938;

class Main {

	public static void main(String[] args) {
		Integer[] vals = { 10, 5, 15, 3, 7, null, 18 };

		TreeNode root = null;

		for (Integer val : vals)
			if (val != null)
				root = insertElementsInBST(root, val);

		// displayElementsInBST(root);

		System.out.println(new Solution().rangeSumBST(root, 6, 15));
	}

	public static TreeNode insertElementsInBST(TreeNode root, Integer val) {
		if (root == null)
			root = new TreeNode(val, null, null);
		else if (root.val > val) {
			root.left = insertElementsInBST(root.left, val);
		} else {
			root.right = insertElementsInBST(root.right, val);
		}

		return root;
	}

	public static void displayElementsInBST(TreeNode root) {
		try {
			System.out.println(root.val);
			displayElementsInBST(root.left);
			displayElementsInBST(root.right);
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}

}
