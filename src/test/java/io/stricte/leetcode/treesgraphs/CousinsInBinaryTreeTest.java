package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.CousinsInBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

class CousinsInBinaryTreeTest {

  @Test
  void test() {

    var cousins = new CousinsInBinaryTree();
    assertThat(cousins.isCousins(new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3)), 4, 3))
      .isFalse();
    assertThat(cousins.isCousins(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5))), 4, 5))
      .isTrue();
    assertThat(cousins.isCousins(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3)), 2, 3))
      .isFalse();
  }
}