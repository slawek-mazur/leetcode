package io.stricte.leetcode.strings;

// https://leetcode.com/problems/implement-strstr/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
Memory Usage: 39.4 MB, less than 5.83% of Java online submissions for Implement strStr().
*/
public class ImplementStrStr {

  public int strStr(String haystack, String needle) {

    if (null == needle || needle.isEmpty()) {
      return 0;
    }

    if (null == haystack || haystack.isEmpty()) {
      return -1;
    }

    char[] hChars = haystack.toCharArray();
    char[] nChars = needle.toCharArray();

    for (int i = 0; i <= hChars.length - nChars.length; i++) {
      if (hChars[i] == nChars[0]) {
        boolean found = helper(i, hChars, nChars);
        if (found) {
          return i;
        }
      }
    }
    return -1;
  }

  private static boolean helper(int index, char[] haystack, char[] needle) {
    int matched = 1;
    for (int i = 1; i < needle.length && index + i < haystack.length; i++) {
      if (haystack[index + i] != needle[i]) {
        return false;
      }
      matched++;
    }
    return matched == needle.length;
  }
}
