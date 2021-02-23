package io.stricte.leetcode.treesgraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

// https://leetcode.com/problems/minimum-distance-between-bst-nodes/
/*
Runtime: 1 ms, faster than 22.77% of Java online submissions for Minimum Distance Between BST Nodes.
Memory Usage: 36.6 MB, less than 51.00% of Java online submissions for Minimum Distance Between BST
*/
public class MinimumDistanceBetweenBSTNodes {

  public int minDiffInBST(TreeNode root) {
    var list = new ArrayList<Integer>();
    var q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      var node = q.remove();
      list.add(node.val);
      if (null != node.left) {
        q.add(node.left);
      }
      if (null != node.right) {
        q.add(node.right);
      }
    }
    Collections.sort(list);

    int min = Integer.MAX_VALUE;
    for (int i = 1; i < list.size(); i++) {
      min = Math.min(min, Math.abs(list.get(i - 1) - list.get(i)));
    }
    return min;
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
