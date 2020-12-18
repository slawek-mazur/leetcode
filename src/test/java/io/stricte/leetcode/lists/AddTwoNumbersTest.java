package io.stricte.leetcode.lists;

import io.stricte.leetcode.lists.AddTwoNumbers.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  @Test
  void test() {

    AddTwoNumbers add = new AddTwoNumbers();
    ListNode list1 = new ListNode(2);
    list1.next = new ListNode(4);
    list1.next.next = new ListNode(3);

    ListNode list2 = new ListNode(5);
    list2.next = new ListNode(6);
    list2.next.next = new ListNode(4);

    System.out.println(add.addTwoNumbers(list1, list2));
  }
}