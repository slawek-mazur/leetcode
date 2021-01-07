package io.stricte.leetcode.treesgraphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// https://leetcode.com/problems/find-mode-in-binary-search-tree/
/*
Runtime: 5 ms, faster than 30.11% of Java online submissions for Find Mode in Binary Search Tree.
Memory Usage: 41.1 MB, less than 12.28% of Java online submissions for Find Mode in Binary Search Tree.
*/
public class FindModeBinarySearchTree {

  public int[] findMode(TreeNode root) {
    if (null == root) {
      return new int[0];
    }
    Map<Integer, Integer> map = new HashMap<>();
    helper(root, map);

    int max = Integer.MIN_VALUE;
    for (Integer v : map.values()) {
      max = Math.max(max, v);
    }

    int c = 0;
    for (Integer v : map.values()) {
      if (v == max) {
        c++;
      }
    }

    int[] res = new int[c];

    int index = 0;
    for (Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() == max) {
        res[index++] = e.getKey();
      }
    }
    return res;
  }

  private void helper(TreeNode node, Map<Integer, Integer> map) {
    if (null == node) {
      return;
    }

    map.merge(node.val, 1, (o, n) -> o + 1);

    helper(node.left, map);
    helper(node.right, map);
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
  }
}
