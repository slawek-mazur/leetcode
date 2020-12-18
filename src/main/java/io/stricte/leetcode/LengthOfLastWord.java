package io.stricte.leetcode;

// https://leetcode.com/problems/length-of-last-word/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
Memory Usage: 37.3 MB, less than 54.33% of Java online submissions for Length of Last Word.
*/
public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    if (null == s) {
      return 0;
    }
    char[] chars = s.toCharArray();
    int l, r = chars.length;
    while (r > 0 && chars[r - 1] == ' ') {
      r--;
    }
    l = r;
    while (l > 0 && chars[l - 1] != ' ') {
      l--;
    }
    return r - l;
  }
}
