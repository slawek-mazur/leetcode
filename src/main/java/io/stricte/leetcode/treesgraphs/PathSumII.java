package io.stricte.leetcode.treesgraphs;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum-ii/
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Path Sum II.
Memory Usage: 39.5 MB, less than 48.37% of Java online submissions for Path Sum II.
*/
public class PathSumII {

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    helper(root, sum, new ArrayList<>(), res);
    return res;
  }

  private static void helper(TreeNode node, int s, List<Integer> nums, List<List<Integer>> res) {
    if (null == node) {
      return;
    }

    nums.add(node.val);

    if (null == node.left && null == node.right && s == node.val) {
      res.add(new ArrayList<>(nums));

    } else {
      helper(node.left, s - node.val, nums, res);
      helper(node.right, s - node.val, nums, res);
    }

    nums.remove(nums.size() - 1);
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
      return val + ((null == left) ? ", null" : ", " + left)
        + ((null == right) ? ", null" : ", " + right);
    }
  }
}
