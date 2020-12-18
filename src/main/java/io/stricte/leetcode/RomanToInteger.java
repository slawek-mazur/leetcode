package io.stricte.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  private static final Map<Character, Integer> NUMBERS;

  static {
    NUMBERS = new HashMap<>();
    NUMBERS.put('I', 1);
    NUMBERS.put('V', 5);
    NUMBERS.put('X', 10);
    NUMBERS.put('L', 50);
    NUMBERS.put('C', 100);
    NUMBERS.put('D', 500);
    NUMBERS.put('M', 1000);
  }

  public int romanToInt(String s) {
    if (null == s || s.length() < 1) {
      return 0;
    }

    int ans = 0;
    char c, pc = '\0';
    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i);

      if (pc != '\0' && NUMBERS.get(pc) < NUMBERS.get(c)) {
        ans += (NUMBERS.get(c) - 2 * NUMBERS.get(pc));

      } else {
        ans += NUMBERS.get(c);
      }
      pc = c;
    }
    return ans;
  }
}
