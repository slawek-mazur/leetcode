package io.stricte.leetcode.treesgraphs;

import io.stricte.leetcode.treesgraphs.LowestCommonAncestorOfBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

class LowestCommonAncestorOfBinaryTreeTest {

  @Test
  void test() {

    LowestCommonAncestorOfBinaryTree tree = new LowestCommonAncestorOfBinaryTree();

    TreeNode four = new TreeNode(4);
    TreeNode five = new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), four));
    TreeNode one = new TreeNode(1, new TreeNode(0), new TreeNode(8));
    TreeNode root = new TreeNode(3, five, one);

    System.out.println(tree.lowestCommonAncestor(root, five, four));
  }
}