package io.stricte.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.lists.RemoveDuplicatesFromSortedList.ListNode;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {

  @Test
  void test() {

    var duplicates = new RemoveDuplicatesFromSortedList();

    assertThat(duplicates.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))))
      .isEqualTo(new ListNode(1, new ListNode(2, new ListNode(3))));

    assertThat(duplicates.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))))
      .isEqualTo(new ListNode(1, new ListNode(2)));
  }
}