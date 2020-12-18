package io.stricte.leetcode.lists;

import io.stricte.leetcode.lists.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  @Test
  void test() {

    ReverseLinkedList reverse = new ReverseLinkedList();

    ListNode list = new ListNode(1);
    list.next = new ListNode(2);
    list.next.next = new ListNode(3);
    list.next.next.next = new ListNode(4);
    list.next.next.next.next = new ListNode(5);

    System.out.println(reverse.reverseList(list));
  }
}