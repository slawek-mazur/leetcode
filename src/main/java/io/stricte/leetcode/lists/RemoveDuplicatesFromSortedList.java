package io.stricte.leetcode.lists;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
Memory Usage: 38.4 MB, less than 50.46% of Java online submissions for Remove Duplicates from Sorted List.
*/
public class RemoveDuplicatesFromSortedList {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode node = head, prev = head;
    while (node != null) {
      if (node.val == prev.val) {
        prev.next = node.next;

      } else {
        prev = node;
      }
      node = node.next;
    }
    return head;
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
    public boolean equals(Object object) {
      if (this == object) {
        return true;
      }
      if (object == null || getClass() != object.getClass()) {
        return false;
      }

      ListNode listNode = (ListNode) object;

      if (val != listNode.val) {
        return false;
      }
      return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
      int result = val;
      result = 31 * result + (next != null ? next.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return val + (null == next ? "" : "->" + next.toString());
    }
  }
}
