package io.stricte.leetcode.treesgraphs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class FlattenBinaryTreeToLinkedList {

  public void flatten(TreeNode root) {
    flattenTreeNode(root);
  }

  public void flattenAlt(TreeNode root) {
    flattenTreeNodeAlt(root);
  }

  private static TreeNode flattenTreeNode(TreeNode node) {
    if (null == node || (null == node.left && null == node.right)) {
      return node;
    }

    TreeNode left = flattenTreeNode(node.left);
    TreeNode right = flattenTreeNode(node.right);

    if (left != null) {
      left.right = node.right;
      node.right = node.left;
      node.left = null;
    }
    return null == right ? left : right;
  }

  private static TreeNode flattenTreeNodeAlt(TreeNode node) {
    if (null == node || (null == node.left && null == node.right)) {
      return node;
    }

    TreeNode left = flattenTreeNodeAlt(node.left);
    TreeNode right = flattenTreeNodeAlt(node.right);

    TreeNode res = node;
    node.right = left;
    node.left = null;

    while (node.right != null) {
      node = node.right;
    }
    node.right = right;

    return res;
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
