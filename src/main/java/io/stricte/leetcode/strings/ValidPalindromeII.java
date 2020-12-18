package io.stricte.leetcode.strings;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {

  public boolean validPalindrome(String s) {
    if (null == s || s.isBlank() || 1 == s.length()) {
      return false;
    }

    char[] chars = s.toCharArray();

    int l = 0, r = chars.length - 1;

    while (l < r) {
      if (chars[l] != chars[r]) {
        return validPalindrome(chars, l + 1, r) ||
          validPalindrome(chars, l, r - 1);
      }
      l++;
      r--;
    }
    return true;
  }

  private boolean validPalindrome(char[] chars, int l, int r) {
    while (l < r) {
      if (chars[l++] != chars[r--]) {
        return false;
      }
    }
    return true;
  }
}
