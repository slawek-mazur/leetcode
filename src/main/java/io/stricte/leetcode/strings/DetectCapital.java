package io.stricte.leetcode.strings;

// https://leetcode.com/problems/detect-capital/
/*
Runtime: 1 ms, faster than 99.05% of Java online submissions for Detect Capital.
Memory Usage: 37.4 MB, less than 68.75% of Java online submissions for Detect Capital.
*/
public class DetectCapital {

  public boolean detectCapitalUse(String word) {

    int lower = 0, upper = 0;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (Character.isLowerCase(c)) {
        lower++;
      }
      if (Character.isUpperCase(c)) {
        upper++;
      }
      if ((lower != 0 && Character.isUpperCase(c)) ||
        (upper > 1 && Character.isLowerCase(c))) {
        return false;
      }
    }
    return true;
  }
}
