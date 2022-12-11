package com.leetcode._1339;

class Solution {
	long result = 0;
	long total_tree_sum = 0;

	public int subtreeSum(TreeNode root) {
		if (root == null)
			return 0;
		else
			return root.val = subtreeSum(root.left) + subtreeSum(root.right) + root.val;
	}

	public void solve(TreeNode root) {
		if (root == null)
			return;
		result = Math.max(result, root.val * (total_tree_sum - root.val));
		solve(root.left);
		solve(root.right);
	}

	public int maxProduct(TreeNode root) {
		total_tree_sum = subtreeSum(root);
		solve(root);
		return (int) (result % 1000000007);
	}
}
