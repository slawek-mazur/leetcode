package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/ugly-number/
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.
Memory Usage: 36.2 MB, less than 24.51% of Java online submissions for Ugly Number.
 */
public class UglyNumber {

  private final static int[] factors = {2, 3, 5};

  public boolean isUgly(int num) {
    if (num < 1) {
      return false;
    }
    if (1 == num) {
      return true;
    }
    for (int factor : factors) {
      if (0 == num % factor) {
        return isUgly(num / factor);
      }
    }
    return false;
  }
}
