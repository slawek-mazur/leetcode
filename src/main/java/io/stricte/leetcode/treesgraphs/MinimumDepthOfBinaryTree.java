package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
/*
Runtime: 5 ms, faster than 46.47% of Java online submissions for Minimum Depth of Binary Tree.
Memory Usage: 60.3 MB, less than 21.73% of Java online submissions for Minimum Depth of Binary Tree.
*/
public class MinimumDepthOfBinaryTree {

  public int minDepth(TreeNode root) {
    if (null == root) {
      return 0;
    }

    int leftLength = minDepth(root.left);
    int rightLength = minDepth(root.right);

    if (0 != leftLength && 0 != rightLength) {
      return Math.min(leftLength, rightLength) + 1;

    } else if (0 != leftLength) {
      return leftLength + 1;

    } else if (0 != rightLength) {
      return rightLength + 1;
    }
    return 1;
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
      return val +
        ", " + (null == left ? "null" : left) +
        ", " + (null == right ? "null" : right) +
        ',';
    }
  }
}
