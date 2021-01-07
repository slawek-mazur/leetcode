package io.stricte.leetcode.strings;

// https://leetcode.com/problems/repeated-substring-pattern/
/*
Runtime: 4 ms, faster than 97.37% of Java online submissions for Repeated Substring Pattern.
Memory Usage: 39.5 MB, less than 65.96% of Java online submissions for Repeated Substring Pattern.
*/
public class RepeatedSubstringPattern {

  public boolean repeatedSubstringPattern(String s) {
    char[] chars = s.toCharArray();
    int n = chars.length;

    for (int size = 1; size <= n / 2; size++) {
      if (n % size != 0) {
        continue;
      }
      boolean found = true;
      for (int i = 0, j = i + size; j < n; ++i, ++j) {
        if (chars[i] != chars[j]) {
          found = false;
          break;
        }
      }
      if (found) {
        return true;
      }
    }
    return false;
  }
}
