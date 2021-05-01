package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.TwoSumIV.TreeNode;
import org.junit.jupiter.api.Test;

class TwoSumIVTest {

  @Test
  void test() {

    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);

    var sumIV = new TwoSumIV();
    assertThat(sumIV.findTarget(root, 9)).isTrue();
  }
}