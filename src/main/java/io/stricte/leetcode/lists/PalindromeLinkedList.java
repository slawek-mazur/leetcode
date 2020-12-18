package io.stricte.leetcode.lists;

// https://leetcode.com/problems/palindrome-linked-list/
/*

 */
// 1, 2, 3, 2, 1
// 1, 2, 2, 1
public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return true;
    }
    ListNode fast = head, slow = head;

    /* find middle element */
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    /* when the length is odd */
    if (fast != null) {
      slow = slow.next;
    }

    /* reverse the second half */
    ListNode prev = null;
    while (slow != null) {
      ListNode temp = slow.next;
      slow.next = prev;
      prev = slow;
      slow = temp;
    }

    /* compare the first and second half */
    slow = prev;
    while (slow != null) {
      if (head.val != slow.val) {
        return false;
      }
      head = head.next;
      slow = slow.next;
    }
    return true;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return val + (null == next ? "" : ", " + next);
    }
  }
}
