package io.stricte.leetcode.lists;

// https://leetcode.com/problems/linked-list-cycle/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
Memory Usage: 39.1 MB, less than 53.56% of Java online submissions for Linked List Cycle.
*/
public class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
