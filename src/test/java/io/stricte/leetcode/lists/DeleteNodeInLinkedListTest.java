package io.stricte.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.lists.DeleteNodeInLinkedList.ListNode;
import org.junit.jupiter.api.Test;

class DeleteNodeInLinkedListTest {

  @Test
  void test() {

    var delete = new DeleteNodeInLinkedList();
    ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
    delete.deleteNode(node.next);
    assertThat(node.toString()).isEqualTo("4->1->9");
  }
}