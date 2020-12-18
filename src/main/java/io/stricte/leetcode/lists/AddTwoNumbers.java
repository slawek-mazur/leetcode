package io.stricte.leetcode.lists;

import lombok.ToString;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0), node = head;
    int carry = 0;
    while (null != l1 || null != l2 || carry > 0) {
      node.next = new ListNode(carry);
      node = node.next;

      if (null != l1) {
        node.val += l1.val;
        l1 = l1.next;
      }
      if (null != l2) {
        node.val += l2.val;
        l2 = l2.next;
      }
      carry = node.val / 10;
      node.val %= 10;
    }
    return head.next;
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
