package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.FindModeBinarySearchTree.TreeNode;
import org.junit.jupiter.api.Test;

class FindModeBinarySearchTreeTest {

  @Test
  void test() {

    var tree = new FindModeBinarySearchTree();

    TreeNode node = new TreeNode(
      1, null, new TreeNode(2, new TreeNode(2), null)
    );
    assertThat(tree.findMode(node)).containsExactlyInAnyOrder(2);
  }
}