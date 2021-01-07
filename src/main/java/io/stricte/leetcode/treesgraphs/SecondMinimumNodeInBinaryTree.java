package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
/*

 */
public class SecondMinimumNodeInBinaryTree {

  public int findSecondMinimumValue(TreeNode root) {
    return helper(root, -1, Integer.MIN_VALUE);
  }

  private int helper(TreeNode node, int res, int max) {
    if (null == node) {
      return res;
    }

    int leftMax = helper(node.left, res, max);
    int rightMax = helper(node.right, res, max);

    //TODO:

    return 0;
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
  }
}
