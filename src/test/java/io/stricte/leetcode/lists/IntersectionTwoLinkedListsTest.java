package io.stricte.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.lists.IntersectionTwoLinkedLists.ListNode;
import org.junit.jupiter.api.Test;

class IntersectionTwoLinkedListsTest {

  @Test
  void test() {

    var lists = new IntersectionTwoLinkedLists();

    ListNode node4 = new ListNode(4);
    ListNode node1 = new ListNode(1);

    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(6);
    ListNode node1_1 = new ListNode(1);

    ListNode node8 = new ListNode(8);
    ListNode node4_1 = new ListNode(4);
    ListNode node5_1 = new ListNode(5);

    node4.next = node1;
    node1.next = node8;
    node8.next = node4_1;
    node4_1.next = node5_1;

    node5.next = node6;
    node6.next = node1_1;
    node1_1.next = node8;

    assertThat(lists.getIntersectionNode(node4, node5)).isEqualTo(node8);
  }
}