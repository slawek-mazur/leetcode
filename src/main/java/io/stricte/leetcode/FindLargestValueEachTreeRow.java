package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueEachTreeRow {

  public List<Integer> largestValues(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (null == root) {
      return res;
    }

    helper(root, 0, res);

    return res;
  }

  private static void helper(TreeNode root, int index, List<Integer> maxes) {
    if (null == root) {
      return;
    }

    if (index >= maxes.size()) {
      maxes.add(root.val);
    } else {
      maxes.set(index, Math.max(root.val, maxes.get(index)));
    }

    helper(root.left, index + 1, maxes);
    helper(root.right, index + 1, maxes);
  }

  public static class TreeNode {

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
      return "TreeNode{" +
        "val=" + val +
        ", left=" + left +
        ", right=" + right +
        '}';
    }
  }
}
