package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.PathSumII.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class PathSumIITest {

  @Test
  void test() {
    PathSumII ii = new PathSumII();

    TreeNode node = new TreeNode(5,
      new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
      new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

    assertThat(ii.pathSum(node, 22)).containsExactlyInAnyOrder(
      List.of(5, 4, 11, 2), List.of(5, 8, 4, 5)
    );
  }
}