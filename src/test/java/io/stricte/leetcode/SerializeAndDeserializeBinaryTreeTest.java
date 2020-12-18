package io.stricte.leetcode;

import io.stricte.leetcode.SerializeAndDeserializeBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

class SerializeAndDeserializeBinaryTreeTest {

  @Test
  void test() {

    SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();

    TreeNode root = new TreeNode(1);
    TreeNode two = new TreeNode(2);
    TreeNode three = new TreeNode(3);
    TreeNode four = new TreeNode(4);
    TreeNode five = new TreeNode(5);

    root.left = two;
    root.right = three;
    root.right.left = four;
    root.right.right = five;

    String serialize = tree.serialize(root);
    System.out.println(serialize);
    System.out.println(tree.deserialize(serialize));
  }
}