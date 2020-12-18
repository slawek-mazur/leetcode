package io.stricte.leetcode;

import io.stricte.leetcode.CopyListRandomPointer.Node;
import org.junit.jupiter.api.Test;

class CopyListRandomPointerTest {

  @Test
  void test() {
    Node head = new Node(7);
    Node next1 = new Node(13);
    Node next2 = new Node(11);
    Node next3 = new Node(10);
    Node next4 = new Node(1);

    head.next = next1;

    next1.next = next2;
    next1.random = head;

    next2.next = next3;
    next2.random = next4;

    next3.next = next4;
    next3.random = next2;

    next4.random = head;

    CopyListRandomPointer pointer = new CopyListRandomPointer();

    System.out.println(pointer.copyRandomList(head));
  }
}