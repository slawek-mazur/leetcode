package io.stricte.leetcode.strings;

// https://leetcode.com/problems/make-the-string-great/
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Make The String Great.
Memory Usage: 37.5 MB, less than 86.68% of Java online submissions for Make The String
*/
public class MakeTheStringGreat {

  public String makeGood(String s) {
    if (s.isEmpty() || 1 == s.length()) {
      return s;
    }
    int m = 0, n = 1, l = s.length();
    var chars = s.toCharArray();
    while (m < l && n < l) {
      while (chars[m] + 32 == chars[n] || chars[m] - 32 == chars[n]) {
        chars[m] = '\0';
        chars[n] = '\0';
        while (m > 0 && chars[m] == '\0') {
          m--;
        }
        if (n < l - 1) {
          n++;
        }
      }
      m = n;
      n++;
    }
    var res = new StringBuilder();
    for (char aChar : chars) {
      if (aChar != '\0') {
        res.append(aChar);
      }
    }
    return res.toString();
  }
}
