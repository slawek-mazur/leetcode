package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Absolute Difference in BST.
Memory Usage: 38.7 MB, less than 73.23% of Java online submissions for Minimum Absolute Difference in BST.
*/
public class MinimumAbsoluteDifferenceInBST {

  private int min;
  private int prev = -1;

  public int getMinimumDifference(TreeNode root) {
    if (root == null) {
      return min;
    }

    getMinimumDifference(root.left);

    if (prev != -1) {
      min = Math.min(min, root.val - prev);
    }
    prev = root.val;

    getMinimumDifference(root.right);

    return min;
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
      return val + ((null == left) ? ", null" : ", " + left)
        + ((null == right) ? ", null" : ", " + right);
    }
  }
}
