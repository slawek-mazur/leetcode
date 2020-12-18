package io.stricte.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/word-pattern/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Word Pattern.
Memory Usage: 36.8 MB, less than 76.05% of Java online submissions for Word Pattern.
*/
public class WordPattern {

  public boolean wordPattern(String pattern, String s) {

    String[] strings = s.split(" ");

    if (strings.length != pattern.length()) {
      return false;
    }

    Map<Object, Object> map = new HashMap<>();
    for (int i = 0; i < strings.length; ++i) {
      Object put1 = map.put(strings[i], i);
      Object put2 = map.put(pattern.charAt(i), i);
      if (put1 != put2) {
        return false;
      }
    }
    return true;

    /*
    Map<Character, String> charToString = new HashMap<>();
    Map<String, Character> stringToChar = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      String string = strings[i];
      if (charToString.containsKey(c)) {
        if (!charToString.get(c).equals(string)) {
          return false;
        }
      } else if (stringToChar.containsKey(string)) {
        if (!stringToChar.get(string).equals(c)) {
          return false;
        }
      } else {
        charToString.put(c, string);
        stringToChar.put(string, c);
      }
    }
    return true;
    */
  }
}
