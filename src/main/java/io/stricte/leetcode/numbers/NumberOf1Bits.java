package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/number-of-1-bits/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
Memory Usage: 35.9 MB, less than 75.37% of Java online submissions for Number of 1 Bits.
*/
public class NumberOf1Bits {

  public int hammingWeight(int n) {
    int res = 0;
    while (n > 0) {
      res += (n & 1);
      n >>>= 1;
    }
    return res;
  }
}
