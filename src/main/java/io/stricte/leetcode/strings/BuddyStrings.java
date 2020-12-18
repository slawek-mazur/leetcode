package io.stricte.leetcode.strings;

// https://leetcode.com/problems/buddy-strings/
/*
Runtime: 1 ms, faster than 98.07% of Java online submissions for Buddy Strings.
Memory Usage: 38.9 MB, less than 74.01% of Java online submissions for Buddy Strings.

Time: O(N)
Space: O(26), A_letters stores up to 26 characters
*/
public class BuddyStrings {

  public boolean buddyStrings(String A, String B) {
    if (null == A || A.isBlank() || null == B || B.isBlank()) {
      return false;
    }

    char[] As = A.toCharArray();
    char[] Bs = B.toCharArray();

    if (As.length != Bs.length) {
      return false;
    }

    if (A.equals(B)) {
      int[] map = new int[26];
      for (char aChar : As) {
        ++map[aChar - 'a'];
      }
      for (int i : map) {
        if (i > 1) {
          return true;
        }
      }
      return false;
    }

    int c = 0;
    char inA = '\0', inB = '\0';
    boolean swapped = false;

    for (int i = 0; i < As.length; i++) {
      if (As[i] != Bs[i]) {
        c++;
        if (c == 2) {
          if (As[i] != inB || Bs[i] != inA) {
            return false;
          }
          swapped = true;

        } else if (c == 1) {
          inA = As[i];
          inB = Bs[i];

        } else {
          return false;
        }
      }
    }
    return swapped;
  }
}
