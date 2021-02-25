package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.SameTree.TreeNode;
import org.junit.jupiter.api.Test;

class SameTreeTest {

  @Test
  void test() {

    var tree = new SameTree();

    assertThat(
      tree.isSameTree(
        new TreeNode(1, new TreeNode(2), null),
        new TreeNode(1, null, new TreeNode(2))
      )).isFalse();

    assertThat(
      tree.isSameTree(
        new TreeNode(1, new TreeNode(2), new TreeNode(3)),
        new TreeNode(1, new TreeNode(2), new TreeNode(3))
      )).isTrue();


  }
}