package io.stricte.leetcode.treesgraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/symmetric-tree/
/*
Runtime: 4 ms, faster than 5.05% of Java online submissions for Symmetric Tree.
Memory Usage: 39.2 MB, less than 5.83% of Java online submissions for Symmetric Tree.
*/
public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    if (null == root) {
      return true;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      List<TreeNode> nodes = new ArrayList<>();
      while (!stack.isEmpty()) {
        nodes.add(stack.pop());
      }

      for (int i = 0, j = nodes.size() - 1; i < nodes.size() / 2; i++, j--) {
        TreeNode left = nodes.get(i);
        TreeNode right = nodes.get(j);
        if ((null == left && right != null) ||
          (null == right && left != null) ||
          (null != left && left.val != right.val)) {

          return false;
        }
      }

      for (TreeNode node : nodes) {
        if (null != node) {
          stack.push(node.left);
          stack.push(node.right);
        }
      }
    }
    return true;
  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this(val);
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
