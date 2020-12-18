package io.stricte.leetcode.strings;

import org.junit.jupiter.api.Test;

class ValidPalindromeIITest {

  @Test
  void test() {

    ValidPalindromeII palindrome = new ValidPalindromeII();

    System.out.println(palindrome.validPalindrome("ebcbbececabbacecbbcbe") ? "OK" : "NOT OK");

    /*
    System.out.println(palindrome.validPalindrome("aac") ? "OK" : "NOT OK");
    System.out.println(palindrome.validPalindrome("abc") ? "OK" : "NOT OK");
    System.out.println(palindrome.validPalindrome("aba") ? "OK" : "NOT OK");
    System.out.println(palindrome.validPalindrome("abca") ? "OK" : "NOT OK");

    */
  }
}