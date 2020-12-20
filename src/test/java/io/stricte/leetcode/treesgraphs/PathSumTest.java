package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.PathSum.TreeNode;
import org.junit.jupiter.api.Test;

class PathSumTest {

  @Test
  void test() {

    var sum = new PathSum();

    assertThat(sum.hasPathSum(null, 0)).isFalse();
    assertThat(sum.hasPathSum(null, 11)).isFalse();
    assertThat(sum.hasPathSum(new TreeNode(1), 1)).isTrue();
    assertThat(sum.hasPathSum(new TreeNode(5,
      new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
      new TreeNode(8, new TreeNode(13), new TreeNode(4, null,
        new TreeNode(1)))), 22)).isTrue();
  }
}