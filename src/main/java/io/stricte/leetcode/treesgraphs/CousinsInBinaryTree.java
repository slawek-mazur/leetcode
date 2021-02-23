package io.stricte.leetcode.treesgraphs;

// https://leetcode.com/problems/cousins-in-binary-tree/
/*

 */
public class CousinsInBinaryTree {

  public boolean isCousins(TreeNode root, int x, int y) {
    Object[] l1 = dfs(root, x, -1);
    Object[] l2 = dfs(root, y, -1);

    return false;//l1 == l2 && l1 != -1;
  }

  private static Object[] dfs(TreeNode node, int v, int lvl) {
    if (null == node || node.val == v) {
      return new Object[]{node, lvl};
    }

    Object[] inLeft = dfs(node.left, v, lvl + 1);
    Object[] inRight = dfs(node.right, v, lvl + 1);

    return null;//-1 == inLeft ? inRight : inLeft;
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
