package io.stricte.leetcode;

// https://leetcode.com/problems/factorial-trailing-zeroes/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Factorial Trailing Zeroes.
Memory Usage: 36.2 MB, less than 11.12% of Java online submissions for Factorial Trailing Zeroes.
*/
public class FactorialTrailingZeroes {

  public int trailingZeroes(int n) {
    return n >= 5 ? n / 5 + trailingZeroes(n / 5) : 0;

    /*
    //to see how it looks like
    BigInteger res = BigInteger.ONE;

    for (int i = 1; i <= n; i++) {
      res = res.multiply(new BigInteger(i + ""));
    }

    return res;
    */
  }
}
