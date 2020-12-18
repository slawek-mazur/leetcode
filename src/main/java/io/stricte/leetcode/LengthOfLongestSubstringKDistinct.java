package io.stricte.leetcode;

public class LengthOfLongestSubstringKDistinct {

  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (null == s || s.isBlank() || 0 == k) {
      return 0;
    }

    int l = 0, r = 0, n = s.length(), ans = 0, unique = 0, c;
    char[] chars = s.toCharArray();
    int[] map = new int[128];
    while (r < n) {
      c = chars[r];
      map[c]++;
      if (1 == map[c]) {
        unique++;
      }
      while (unique > k) {
        if (0 == --map[chars[l++]]) {
          unique--;
        }
      }
      ans = Math.max(ans, r - l + 1);
      r++;
    }
    return ans;
  }
}
