package io.stricte.leetcode.treesgraphs;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
/*

 */
public class TwoSumIV {

  public boolean findTarget(TreeNode root, int k) {
    return helper(root, k, new HashSet<Integer>());
  }

  private static boolean helper(TreeNode node, int k, Set<Integer> set) {
    if (null == node) {
      return false;
    }
    if (set.contains(k - node.val)) {
      return true;
    }
    set.add(node.val);
    return helper(node.left, k, set) || helper(node.right, k, set);
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
