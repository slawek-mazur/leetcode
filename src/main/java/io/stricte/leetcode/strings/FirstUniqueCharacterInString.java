package io.stricte.leetcode.strings;

// https://leetcode.com/problems/first-unique-character-in-a-string/
/*
Runtime: 7 ms, faster than 87.75% of Java online submissions for First Unique Character in a String.
Memory Usage: 39.6 MB, less than 55.08% of Java online submissions for First Unique Character in a String.
*/
public class FirstUniqueCharacterInString {

  public int firstUniqChar(String s) {

    int[] map = new int[26];
    for (int idx = 0; idx < s.length(); idx++) {
      map[s.charAt(idx) - 'a']++;
    }

    for (int idx = 0; idx < s.length(); idx++) {
      if (1 == map[s.charAt(idx) - 'a']) {
        return idx;
      }
    }
    return -1;
  }
}
