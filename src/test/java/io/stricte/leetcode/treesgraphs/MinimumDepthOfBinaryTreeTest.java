package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.MinimumDepthOfBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

class MinimumDepthOfBinaryTreeTest {

  @Test
  void test() {

    var depth = new MinimumDepthOfBinaryTree();

    assertThat(depth.minDepth(
      new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))
    )).isEqualTo(2);

    assertThat(depth.minDepth(
      new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))))
    )).isEqualTo(5);
  }
}