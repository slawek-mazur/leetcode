package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.SumOfLeftLeaves.TreeNode;
import org.junit.jupiter.api.Test;

class SumOfLeftLeavesTest {

  @Test
  void test() {

    var sum = new SumOfLeftLeaves();
    assertThat(sum.sumOfLeftLeaves(new TreeNode(1))).isEqualTo(0);
    assertThat(sum.sumOfLeftLeaves(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3))))).isEqualTo(0);
    assertThat(sum.sumOfLeftLeaves(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))))).isEqualTo(24);
    assertThat(sum.sumOfLeftLeaves(new TreeNode(3, new TreeNode(9, new TreeNode(5), null), new TreeNode(20, new TreeNode(15), new TreeNode(7))))).isEqualTo(20);
    assertThat(sum.sumOfLeftLeaves(new TreeNode(1))).isEqualTo(0);
  }
}