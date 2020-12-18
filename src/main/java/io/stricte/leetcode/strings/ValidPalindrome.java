package io.stricte.leetcode.strings;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    if (null == s || s.trim().isEmpty()) {
      return true;
    }

    char[] sa = s.toLowerCase().toCharArray();

    int l = 0, r = sa.length - 1;
    char c;
    while (l < r) {
      c = sa[l];
      while (l < r && invalid(c)) {
        c = sa[++l];
      }

      c = sa[r];
      while (l < r && invalid(c)) {
        c = sa[--r];
      }

      //System.out.println("l=" + l + ", r=" + r + ", sa[l]=" + sa[l] + ", sa[r]=" + sa[r]);

      if (sa[l++] != sa[r--]) {
        return false;
      }
    }
    return true;
  }

  private static boolean invalid(char c) {
    return (c < 'a' || c > 'z') && (c < '0' || c > '9');
  }
}
