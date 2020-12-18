package io.stricte.leetcode.treesgraphs;

import io.stricte.leetcode.treesgraphs.BinaryTreeMaximumPathSum.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreeMaximumPathSumTest {

  @Test
  void test() {

    BinaryTreeMaximumPathSum maxSum = new BinaryTreeMaximumPathSum();

    //TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode node = new TreeNode(-10,
      new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

    System.out.println(maxSum.maxPathSum(node));
  }
}