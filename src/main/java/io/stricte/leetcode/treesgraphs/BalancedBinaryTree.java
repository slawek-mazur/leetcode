package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/balanced-binary-tree/
/*
Runtime: 1 ms, faster than 42.64% of Java online submissions for Balanced Binary Tree.
Memory Usage: 41.3 MB, less than 5.21% of Java online submissions for Balanced Binary Tree.
 */
public class BalancedBinaryTree {

  private boolean result;

  // alternative, with global state
  public boolean isBalanced(TreeNode root) {
    result = true;
    height(root);
    return result;
  }

  private int height(TreeNode node) {
    if (!result || null == node) {
      return 0;
    }
    int left = height(node.left);
    int right = height(node.right);

    if (Math.abs(left - right) > 1) {
      result = false;
      return 0;
    }
    return 1 + Math.max(left, right);
  }

  /*
  // alternative, without global state
  public boolean isBalanced(TreeNode root) {
    return -1 != height(root);
  }

  private static int height(TreeNode node) {
    if (null == node) {
      return 0;
    }
    int left = height(node.left);
    int right = height(node.right);

    if (-1 == left || -1 == right || Math.abs(left - right) > 1) {
      return -1;
    }
    return 1 + Math.max(left, right);
  }
  */

  static public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return val +
        ", " + (null == left ? "null" : left) +
        ", " + (null == right ? "null" : right) +
        ',';
    }
  }
}
