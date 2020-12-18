package io.stricte.leetcode.strings;

// https://leetcode.com/problems/maximum-repeating-substring/
public class MaximumRepeatingSubstring {

  public int maxRepeating(String sequence, String word) {
    int res = 0, sn = sequence.length(), wn = word.length();

    for (int i = 0; i < sn; i++) {
      if (sequence.charAt(i) == word.charAt(0)) {
        int a = i, b = 0, c = 0;
        while (a < sn && b < wn &&
          sequence.charAt(a) == word.charAt(b)) {
          a++;
          b++;
          if (b == wn) {
            b = 0;
            c++;
          }
        }
        res = Math.max(res, c);
      }
    }
    return res;
  }
}
