package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.SymmetricTree.TreeNode;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {

  @Test
  void test() {

    var tree = new SymmetricTree();

    TreeNode n1 = new TreeNode(
      1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, new TreeNode(3), null)
    );
    assertThat(tree.isSymmetric(n1)).isTrue();

    TreeNode asymmetric = new TreeNode(
      1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))
    );
    assertThat(tree.isSymmetric(asymmetric)).isFalse();

    TreeNode symmetric = new TreeNode(
      1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))
    );
    assertThat(tree.isSymmetric(symmetric)).isTrue();
  }
}