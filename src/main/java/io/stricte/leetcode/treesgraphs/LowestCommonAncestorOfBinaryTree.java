package io.stricte.leetcode.treesgraphs;

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
