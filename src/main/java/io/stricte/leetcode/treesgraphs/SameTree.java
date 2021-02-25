package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/same-tree/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
Memory Usage: 36.1 MB, less than 95.58% of Java online submissions for Same Tree.
*/
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    return (null == p && null == q) ||
      ((null != p && null != q && p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
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
  }
}
