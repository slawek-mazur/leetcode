package io.stricte.leetcode.treesgraphs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class BinaryTreeMaximumPathSum {

  private int ans = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    helper(root);
    return ans;
  }

  private int helper(TreeNode node) {
    if (null == node) {
      return 0;
    }

    int left = helper(node.left);
    int right = helper(node.right);
    ans = Math.max(ans, node.val + left + right);

    return Math.max(0, node.val + Math.max(left, right));
  }

  @NoArgsConstructor
  @AllArgsConstructor
  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; }

    @Override
    public String toString() {
      return "(" + val + ", l=" + left + ", r=" + right + ')';
    }
  }
}
