package io.stricte.leetcode.treesgraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {

  public List<Integer> rightSideView(TreeNode root) {
    if (null == root) {
      return Collections.emptyList();
    }

    final Deque<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);

    final List<Integer> ans = new LinkedList<>();

    while (!nodes.isEmpty()) {
      ans.add(nodes.peek().val);

      Deque<TreeNode> childNodes = new LinkedList<>();
      while (!nodes.isEmpty()) {
        TreeNode node = nodes.pop();
        if (null != node.right) {
          childNodes.add(node.right);
        }
        if (null != node.left) {
          childNodes.add(node.left);
        }
      }
      nodes.addAll(childNodes);
    }
    return ans;
  }

  public List<Integer> rightSideViewAlt(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    dfs(root, 0, ans);
    return ans;
  }

  private static void dfs(TreeNode node, int level, List<Integer> edges) {
    if (null == node) {
      return;
    }

    if (level == edges.size()) {
      edges.add(node.val);
    }
    dfs(node.right, level + 1, edges);
    dfs(node.left, level + 1, edges);
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
      return "N{" +
        "v=" + val +
        ", l=" + left +
        ", r=" + right +
        '}';
    }
  }
}
