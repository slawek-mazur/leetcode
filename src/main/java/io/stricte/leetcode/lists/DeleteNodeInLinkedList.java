package io.stricte.leetcode.lists;

// https://leetcode.com/problems/delete-node-in-a-linked-list/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
Memory Usage: 38.7 MB, less than 23.15% of Java online submissions for Delete Node in a Linked List.
*/
public class DeleteNodeInLinkedList {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }

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
