package io.stricte.leetcode.lists;

import lombok.ToString;

public class ReorderList {

  public void reorderList(ListNode head) {
    if (null == head || null == head.next) {
      return;
    }

    ListNode middle = middleNode(head);
    ListNode reversed = reversList(middle);
    mergeTwoLists(middle, reversed);
  }

  private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode ans = new ListNode(), curr = ans;
    while (null != l1 && null != l2) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;

      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }
    curr.next = null != l1 ? l1 : l2;
    return ans.next;
  }

  private static ListNode reversList(ListNode head) {
    ListNode prev = null, curr = head;
    while (curr != null) {
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }

  private static ListNode middleNode(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
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
