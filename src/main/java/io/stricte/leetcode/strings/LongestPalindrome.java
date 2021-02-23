package io.stricte.leetcode.strings;

// https://leetcode.com/problems/longest-palindrome/
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Longest Palindrome.
Memory Usage: 37.3 MB, less than 84.12% of Java online submissions for Longest Palindrome.
*/
public class LongestPalindrome {

  public int longestPalindrome(String s) {

    int[] map = new int[128];
    for (char c : s.toCharArray()) {
      map[c]++;
    }

    int res = 0;
    boolean hasOdd = false;
    for (int i : map) {
      if ((i & 1) == 1) {
        hasOdd = true;
        res += i - 1;
      } else {
        res += i;
      }
    }
    return res + (hasOdd ? 1 : 0);
  }
}
