package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/sum-of-left-leaves/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
Memory Usage: 36.3 MB, less than 99.42% of Java online submissions for Sum of Left Leaves.
*/
public class SumOfLeftLeaves {

  public int sumOfLeftLeaves(TreeNode root) {
    if (null == root) {
      return 0;
    }

    int res = 0;
    if (null != root.left && null == root.left.left && null == root.left.right) {
      res = root.left.val;
    }
    return res + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
  }

  static class TreeNode {

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
      return String.format("%d (%s, %s)", val, left, right);
    }
  }
}
