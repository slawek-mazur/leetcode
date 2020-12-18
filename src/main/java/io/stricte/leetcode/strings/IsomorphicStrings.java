package io.stricte.leetcode.strings;

// https://leetcode.com/problems/isomorphic-strings/
/*
Runtime: 6 ms, faster than 75.28% of Java online submissions for Isomorphic Strings.
Memory Usage: 39.8 MB, less than 7.40% of Java online submissions for Isomorphic Strings.
*/
public class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {

    char[] map = new char[256];

    for (int i = 0; i < s.length(); i++) {
      char cs = s.charAt(i), ct = t.charAt(i);
      if (0 == map[cs] && 0 == map[ct + 128]) {
        map[cs] = ct;
        map[ct + 128] = cs;

        // mapping is different OR mapped from other character
      } else if (map[cs] != ct || map[ct + 128] != cs) {
        return false;
      }
    }
    return true;

    /*
    // Runtime: 5 ms, faster than 80.08% of Java online submissions for Isomorphic Strings.
    // Memory Usage: 38.8 MB, less than 85.30% of Java online submissions for Isomorphic Strings.
    
    int[] m = new int[256];
    for (int i = 0; i < s.length(); i++) {
      if (m[s.charAt(i)] != m[t.charAt(i) + 128]) {
        return false;
      }
      m[s.charAt(i)] = m[t.charAt(i) + 128] = i + 1;
    }
    return true;
    */
  }
}
