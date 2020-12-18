package io.stricte.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (q.size() > 0) {
      TreeNode node = q.poll();
      sb.append(node == null ? "null" : node.val);
      sb.append(",");
      if (node != null) {
        q.add(node.left);
        q.add(node.right);
      }
    }
    return sb.deleteCharAt(sb.length() - 1).toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    if (null == data || data.isBlank()) {
      return null;
    }

    String[] nodes = data.split(",");
    Queue<TreeNode> roots = new LinkedList<>();
    TreeNode root = nodeOrNull(nodes[0]);
    if (root != null) {
      roots.add(root);
    }
    int i = 1;
    while (roots.size() > 0) {
      TreeNode next = roots.poll();
      TreeNode left = nodeOrNull(nodes[i++]);
      if (left != null) {
        next.left = left;
        roots.add(left);
      }
      TreeNode right = nodeOrNull(nodes[i++]);
      if (right != null) {
        next.right = right;
        roots.add(right);
      }
    }
    return root;
  }

  private static TreeNode nodeOrNull(String node) {
    return node.equals("null") ? null : new TreeNode(Integer.parseInt(node));
  }

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }

    @Override
    public String toString() {
      return String.format("%d (%s, %s)", val, left, right);
    }
  }
}
