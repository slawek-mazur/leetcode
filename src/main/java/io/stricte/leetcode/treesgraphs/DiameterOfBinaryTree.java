package io.stricte.leetcode.treesgraphs;

public class DiameterOfBinaryTree {

  private int ans = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    dfs(root);
    return ans;
  }

  private int dfs(TreeNode node) {
    if (null == node) {
      return 0;
    }

    int left = dfs(node.left);
    int right = dfs(node.right);

    ans = Math.max(ans, left + right);

    return Math.max(left, right) + 1;
  }

  public class TreeNode {

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
