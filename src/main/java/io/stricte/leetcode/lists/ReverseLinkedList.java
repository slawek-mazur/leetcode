package io.stricte.leetcode.lists;

import lombok.ToString;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (null != head) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

  @ToString
  public static class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
