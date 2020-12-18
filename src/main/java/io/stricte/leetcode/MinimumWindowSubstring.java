package io.stricte.leetcode;

public class MinimumWindowSubstring {

  public String minWindow(String s, String t) {
    int sLength = s.length(), tLength = t.length();

    int[] map = new int[128];
    for (char c : t.toCharArray()) {
      ++map[c];
    }

    char[] sChars = s.toCharArray();
    int left = 0, tCount = tLength;
    int minStart = 0, minLength = Integer.MAX_VALUE;
    for (int right = 0; right < sLength; ++right) {
      if (map[sChars[right]]-- > 0) {
        --tCount;
      }
      while (tCount == 0) {
        if (right - left < minLength) {
          minLength = right - (minStart = left);
        }
        if (++map[sChars[left++]] > 0) {
          ++tCount;
        }
      }
    }

    return minLength != Integer.MAX_VALUE ? s.substring(minStart, minStart + minLength + 1) : "";
  }
}
