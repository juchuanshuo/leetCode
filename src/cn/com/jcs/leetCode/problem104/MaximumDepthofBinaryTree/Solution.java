package cn.com.jcs.leetCode.problem104.MaximumDepthofBinaryTree;

/**
 * Given a binary tree, find its maximum depth.
 *
 *The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *Note: A leaf is a node with no children.
 *
 *Example:
 *
 *Given binary tree [3,9,20,null,null,15,7],
 *
 *   3
 *  / \
 *  9  20
 *   /  \
 *  15   7
 *return its depth = 3.
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public int maxDepth(TreeNode root) {
		int count = calNode(root, 0);
		return Integer.parseInt(Math.log10(Double.parseDouble(count + "")) + "");
	}

	public static int calNode(TreeNode root, int count) {
		count = count + 1;
		if (root.left != null) {
			return calNode(root, count);
		}
		if (root.right != null) {
			return calNode(root, count);
		}
		return count;
	}
}