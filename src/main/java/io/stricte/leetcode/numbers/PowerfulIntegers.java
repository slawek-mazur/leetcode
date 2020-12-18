package io.stricte.leetcode.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/powerful-integers/
/*
Runtime: 1 ms, faster than 89.39% of Java online submissions for Powerful Integers.
Memory Usage: 37 MB, less than 26.14% of Java online submissions for Powerful Integers.
*/
public class PowerfulIntegers {

  public List<Integer> powerfulIntegers(int x, int y, int bound) {
    Set<Integer> ans = new HashSet<>();
    int a = 1, b = 1;//a=x^i  b=y^j
    while ((a + b) <= bound) {   //iterate through i
      while ((a + b) <= bound) {    //iterate through j
        ans.add(a + b);
        b *= y;
        if (y == 1) {
          break;
        }
      }
      b = 1;
      a *= x;
      if (x == 1) {
        break;
      }
    }
    return new ArrayList<>(ans);
  }
}
