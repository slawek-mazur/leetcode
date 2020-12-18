package io.stricte.leetcode.lists;

// https://leetcode.com/problems/remove-linked-list-elements/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
Memory Usage: 39.6 MB, less than 87.99% of Java online submissions for Remove Linked List Elements.
*/
public class RemoveLinkedListElements {

  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }
    ListNode node = head;
    while (node != null && node.next != null) {
      if (node.next.val == val) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }
    return head;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return val + (null == next ? "" : "->" + next.toString());
    }
  }
}
