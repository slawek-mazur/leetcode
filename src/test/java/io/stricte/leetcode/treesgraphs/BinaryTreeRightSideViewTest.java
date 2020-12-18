package io.stricte.leetcode.treesgraphs;

import io.stricte.leetcode.treesgraphs.BinaryTreeRightSideView.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreeRightSideViewTest {

  @Test
  void test() {

    TreeNode node = new TreeNode(1,
      new TreeNode(2, null, new TreeNode(5)),
      //new TreeNode(3, null, new TreeNode(4))
      new TreeNode(3)
    );

    System.out.println(new BinaryTreeRightSideView().rightSideView(node));

    System.out.println(new BinaryTreeRightSideView().rightSideViewAlt(node));
  }
}