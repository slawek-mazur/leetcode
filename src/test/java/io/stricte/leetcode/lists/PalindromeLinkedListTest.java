package io.stricte.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.lists.PalindromeLinkedList.ListNode;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

  @Test
  void test() {
    var linkedList = new PalindromeLinkedList();

    assertThat(linkedList.isPalindrome(
      new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(2, new ListNode(1)))))
    )).isTrue();

    assertThat(linkedList.isPalindrome(
      new ListNode(1, new ListNode(2))
    )).isFalse();

    assertThat(linkedList.isPalindrome(
      new ListNode(1, new ListNode(2, new ListNode(3)))
    )).isFalse();

    assertThat(linkedList.isPalindrome(
      new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))
    )).isTrue();
  }
}