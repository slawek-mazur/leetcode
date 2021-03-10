package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.MinimumAbsoluteDifferenceInBST.TreeNode;
import org.junit.jupiter.api.Test;

class MinimumAbsoluteDifferenceInBSTTest {

  @Test
  void test() {

    var nodes = new MinimumAbsoluteDifferenceInBST();
    assertThat(nodes.getMinimumDifference(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6)))).isEqualTo(1);
    assertThat(nodes.getMinimumDifference(new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12), new TreeNode(49))))).isEqualTo(1);
  }
}