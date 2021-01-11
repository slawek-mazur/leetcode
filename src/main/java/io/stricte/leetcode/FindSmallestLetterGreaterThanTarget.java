package io.stricte.leetcode;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
Memory Usage: 39.6 MB, less than 23.51% of Java online submissions for Find Smallest Letter Greater Than Target.
*/
public class FindSmallestLetterGreaterThanTarget {

  public char nextGreatestLetter(char[] letters, char target) {
    int[] map = new int[26];
    for (char letter : letters) {
      map[letter - 'a']++;
    }
    for (int i = target - 'a' + 1; ; i++) {
      if (map[i % 26] > 0) {
        return (char) (i % 26 + 'a');
      }
    }
  }
}
