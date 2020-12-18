package io.stricte.leetcode.strings;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    if (null == s) {
      return 0;
    }
    if (s.length() < 2) {
      return s.length();
    }

    int noDuplicatePos = 0, max = 0;
    int[] map = new int[128];
    for (int index = 0; index < s.length(); index++) {
      char c = s.charAt(index);
      if (map[c] > noDuplicatePos) {
        noDuplicatePos = map[c];
      }

      max = Math.max(max, index - noDuplicatePos + 1);

      map[c] = index + 1;
    }
    return max;
  }
}
