package io.stricte.leetcode;

public class CopyListRandomPointer {

  public Node copyRandomList(Node head) {

    Node newHead = head;
    while (null != newHead) {
      Node tmp = newHead.next;

      Node newNode = new Node(newHead.val);
      newHead.next = newNode;
      newNode.next = tmp;

      newHead = newNode.next;
    }

    newHead = head;
    while (null != newHead && null != newHead.next) {
      Node tmp = newHead.next;

      if (null != newHead.random) {
        tmp.random = newHead.random.next;
      }

      newHead = tmp.next;
    }

    Node p = head;
    Node dummy = new Node(0);
    Node q = dummy;
    while (null != p) {
      q.next = p.next;
      p.next = p.next.next;
      q = q.next;
      p = p.next;
    }

    return dummy.next;
  }

  public static class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }

    @Override
    public String toString() {
      return String.format("[%d-%s (%s)]", val,
        next, null != random ? random.val : null);
    }
  }
}
