package io.stricte.leetcode.lists;

import io.stricte.leetcode.lists.ReorderList.ListNode;
import org.junit.jupiter.api.Test;

class ReorderListTest {

  @Test
  void test() {

    ReorderList list = new ReorderList();

    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);

    System.out.println(node);

    list.reorderList(node);

    System.out.println(node);
  }
}