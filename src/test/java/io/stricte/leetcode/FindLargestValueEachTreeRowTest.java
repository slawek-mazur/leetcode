package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.FindLargestValueEachTreeRow.TreeNode;
import org.junit.jupiter.api.Test;

class FindLargestValueEachTreeRowTest {

  @Test
  void test() {

    var row = new FindLargestValueEachTreeRow();

    //-------

    TreeNode node = new TreeNode(1);

    node.left = new TreeNode(3);
    node.left.left = new TreeNode(5);
    node.left.right = new TreeNode(3);

    node.right = new TreeNode(2);
    node.right.right = new TreeNode(9);

    assertThat(row.largestValues(node)).containsExactly(1, 3, 9);

    //-------

    TreeNode node1 = new TreeNode(1);
    node1.left = new TreeNode(2);
    node1.right = new TreeNode(3);

    assertThat(row.largestValues(node1)).containsExactly(1, 3);

    //-------

    TreeNode node2 = new TreeNode(1);
    node2.right = new TreeNode(2);

    assertThat(row.largestValues(node2)).containsExactly(1, 2);
  }
}