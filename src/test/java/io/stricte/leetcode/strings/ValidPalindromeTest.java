package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  @Test
  void test() {

    var palindrome = new ValidPalindrome();

    assertThat(palindrome.isPalindrome(null)).isTrue();
    assertThat(palindrome.isPalindrome("")).isTrue();
    assertThat(palindrome.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    assertThat(palindrome.isPalindrome("race a car")).isFalse();
  }
}