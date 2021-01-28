package io.stricte.leetcode.strings;

// https://leetcode.com/problems/backspace-string-compare/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Backspace String Compare.
Memory Usage: 36.6 MB, less than 99.93% of Java online submissions for Backspace String Compare.
*/
public class BackspaceStringCompare {

  public boolean backspaceCompare(String S, String T) {
    char[] s = S.toCharArray();
    char[] t = T.toCharArray();

    int i = s.length - 1, j = t.length - 1, hashes;
    while (true) {
      hashes = 0;
      while (i >= 0 && (hashes > 0 || '#' == s[i])) {
        hashes += ('#' == s[i] ? 1 : -1);
        i--;
      }

      hashes = 0;
      while (j >= 0 && (hashes > 0 || '#' == t[j])) {
        hashes += ('#' == t[j] ? 1 : -1);
        j--;
      }

      if (i >= 0 && j >= 0 && s[i] == t[j]) {
        i--;
        j--;

      } else {
        break;
      }
    }
    return -1 == i && -1 == j;
  }
}
