package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/path-sum/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
Memory Usage: 39 MB, less than 55.25% of Java online submissions for Path Sum.
*/
public class PathSum {

  public boolean hasPathSum(TreeNode root, int sum) {
    if (null == root) {
      return false;
    }
    return helper(root, sum);
  }

  private static boolean helper(TreeNode node, int s) {
    if (null == node) {
      return false;
    }

    if (null == node.left && null == node.right) {
      return 0 == s - node.val;
    }

    return helper(node.left, s - node.val) ||
      helper(node.right, s - node.val);
  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return val + ((null == left) ? ", null" : ", " + left)
        + ((null == right) ? ", null" : ", " + right);
    }
  }
}
