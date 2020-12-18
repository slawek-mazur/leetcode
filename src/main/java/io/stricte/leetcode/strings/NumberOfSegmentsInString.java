package io.stricte.leetcode.strings;

// https://leetcode.com/problems/number-of-segments-in-a-string/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
Memory Usage: 36.6 MB, less than 91.33% of Java online submissions for Number of Segments in a String.
*/
public class NumberOfSegmentsInString {

  public int countSegments(String s) {
    if (null == s || s.isBlank()) {
      return 0;
    }

    char[] chars = s.toCharArray();
    /*
    int res = 0;
    for (int i = 0; i < chars.length; i++) {
      if ((i == 0 || chars[i - 1] == ' ') && chars[i] != ' ') {
        res++;
      }
    }
    return res;
    */
    int l = 0, r = chars.length, count = 0;
    while (l < r) {
      while (l < r && chars[l] == ' ') {
        l++;
      }
      if (l >= r) {
        break;
      }
      while (l < r && chars[l] != ' ') {
        l++;
      }
      count++;
    }
    return count;
  }
}
