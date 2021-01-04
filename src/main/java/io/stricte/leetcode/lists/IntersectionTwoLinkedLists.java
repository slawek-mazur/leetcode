package io.stricte.leetcode.lists;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode pa = headA, pb = headB;
    while (pa != pb) {
      if (null != pa) {
        pa = pa.next;
      } else {
        pa = headB;
      }

      if (null != pb) {
        pb = pb.next;
      } else {
        pb = headA;
      }
    }
    return pa;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }

    @Override
    public String toString() {
      return val + (null == next ? "" : "->" + next);
    }
  }
}
