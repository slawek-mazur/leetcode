package io.stricte.leetcode;

// https://leetcode.com/problems/longest-common-prefix/
/*
Runtime: 1 ms, faster than 52.29% of Java online submissions for Longest Common Prefix.
Memory Usage: 37 MB, less than 66.02% of Java online submissions for Longest Common Prefix.
*/
public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (null == strs || strs.length < 1) {
      return "";
    }

    final String res = strs[0];
    int end = res.length();
    for (int i = 1; i < strs.length; i++) {
      String str = strs[i];
      if (null == str) {
        return "";
      }
      int j = 0;
      for (; j < str.length() && j < end; j++) {
        if (res.charAt(j) != str.charAt(j)) {
          break;
        }
      }
      if (0 == j) {
        return "";
      }
      end = j;
    }
    return res.substring(0, end);
  }
}
