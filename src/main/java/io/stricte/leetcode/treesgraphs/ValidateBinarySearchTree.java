package io.stricte.leetcode.treesgraphs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class ValidateBinarySearchTree {

  public boolean isValidBST(TreeNode root) {
    return isValid(root, null, null);
  }

  private static boolean isValid(TreeNode node, Integer upper, Integer lower) {
    if (null == node) {
      return true;
    }

    int val = node.val;
    if (null != upper && val >= upper) {
      return false;
    }
    if (null != lower && val <= lower) {
      return false;
    }
    return isValid(node.left, val, lower) && isValid(node.right, upper, val);
  }

  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; }
  }
}
