package io.stricte.leetcode.treesgraphs;

import io.stricte.leetcode.treesgraphs.FlattenBinaryTreeToLinkedList.TreeNode;
import org.junit.jupiter.api.Test;

class FlattenBinaryTreeToLinkedListTest {

  private final FlattenBinaryTreeToLinkedList tree = new FlattenBinaryTreeToLinkedList();

  @Test
  void test() {

    TreeNode node1 = node();
    tree.flatten(node1);
    System.out.println(node1);

    TreeNode node2 = node();
    tree.flattenAlt(node2);
    System.out.println(node2);
  }

  @Test
  void test2() {
    TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
    tree.flatten(treeNode);
    System.out.println(treeNode);
  }

  private static TreeNode node() {
    return new TreeNode(1,
      new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, null, new TreeNode(6))
    );
  }
}