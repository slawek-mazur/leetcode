package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
/*
Runtime: 4 ms, faster than 56.25% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
Memory Usage: 40.2 MB, less than 25.10% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
*/
public class LowestCommonAncestorOfBinaryTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (null == root || root == p || root == q) {
      return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (null != left && null != right) {
      return root;
    }
    return left == null ? right : left;
  }

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }

    TreeNode(int x, TreeNode left, TreeNode right) {
      val = x;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return "{" + val +
        ", l=" + left +
        ", r=" + right +
        '}';
    }
  }
}
