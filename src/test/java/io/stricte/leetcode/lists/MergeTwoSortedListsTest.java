package io.stricte.leetcode.lists;

import io.stricte.leetcode.lists.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

  @Test
  void test() {

    MergeTwoSortedLists merge = new MergeTwoSortedLists();

    ListNode l1 = new ListNode(1);
    //l1.next = new ListNode(2);
    //l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(10);
    l2.next = new ListNode(20);
    l2.next.next = new ListNode(30);

    System.out.println(merge.mergeTwoLists(l1, l2));
  }
}