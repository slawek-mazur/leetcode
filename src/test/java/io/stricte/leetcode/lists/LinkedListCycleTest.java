package io.stricte.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.lists.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

  @Test
  void test() {

    var cycle = new LinkedListCycle();

    ListNode three = new ListNode(3);
    ListNode two = new ListNode(2);
    ListNode zero = new ListNode(0);
    ListNode minusFour = new ListNode(-4);

    three.next = two;
    two.next = zero;
    zero.next = minusFour;
    minusFour.next = two;

    assertThat(cycle.hasCycle(three)).isTrue();

    ListNode ten = new ListNode(10);
    ListNode twenty = new ListNode(20);
    ten.next = twenty;
    twenty.next = ten;

    assertThat(cycle.hasCycle(ten)).isTrue();
  }
}