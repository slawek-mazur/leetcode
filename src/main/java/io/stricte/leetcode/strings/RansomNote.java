package io.stricte.leetcode.strings;

// https://leetcode.com/problems/ransom-note/
/*
Runtime: 5 ms, faster than 55.02% of Java online submissions for Ransom Note.
Memory Usage: 43.6 MB, less than 9.24% of Java online submissions for Ransom Note.
*/
public class RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
    int[] map = new int[26];

    for (char c : ransomNote.toCharArray()) {
      map[c - 'a']++;
    }

    for (char c : magazine.toCharArray()) {
      map[c - 'a']--;
    }

    for (int i : map) {
      if (i > 0) {
        return false;
      }
    }
    return true;
  }
}
