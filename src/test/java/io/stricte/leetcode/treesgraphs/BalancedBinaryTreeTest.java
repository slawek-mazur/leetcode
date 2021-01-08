package io.stricte.leetcode.treesgraphs;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.treesgraphs.BalancedBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

  @Test
  void test() {

    var tree = new BalancedBinaryTree();

    assertThat(tree.isBalanced(
      new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5), null), null), null), null)
      )
    ).isFalse();

    assertThat(tree.isBalanced(
      new TreeNode(1,
        new TreeNode(2, new TreeNode(4, new TreeNode(6), null), null),
        new TreeNode(3, null, new TreeNode(5, null, new TreeNode(7))))
      )
    ).isFalse();

    assertThat(tree.isBalanced(new TreeNode(1,
      new TreeNode(2, null, new TreeNode(4, new TreeNode(5), null)),
      new TreeNode(3)))
    ).isFalse();

    assertThat(tree.isBalanced(new TreeNode(1,
        new TreeNode(2,
          new TreeNode(3,
            new TreeNode(4), new TreeNode(4)
          ),
          new TreeNode(3)
        ),
        new TreeNode(2)
      ))
    ).isFalse();

    assertThat(tree.isBalanced(new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
          new TreeNode(15), new TreeNode(7))
      ))
    ).isTrue();

    assertThat(tree.isBalanced(null)).isTrue();

    assertThat(tree.isBalanced(new TreeNode(1))).isTrue();
  }
}