package io.stricte.leetcode.treesgraphs;

import io.stricte.leetcode.treesgraphs.ValidateBinarySearchTree.TreeNode;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

  @Test
  void test() {

    ValidateBinarySearchTree tree = new ValidateBinarySearchTree();

    TreeNode node = new TreeNode(
      15, new TreeNode(10), new TreeNode(20, new TreeNode(6) ,new TreeNode(30))
    );

    System.out.println(tree.isValidBST(node));
  }
}