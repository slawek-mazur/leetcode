package io.stricte.leetcode;

// https://leetcode.com/problems/arranging-coins/
/*
Runtime: 7 ms, faster than 32.10% of Java online submissions for Arranging Coins.
Memory Usage: 36 MB, less than 77.62% of Java online submissions for Arranging Coins.
*/
public class ArrangingCoins {

  public int arrangeCoins(int n) {
    if (n < 1) {
      return 0;
    }

    int c = 0, sub = 1;
    while (n > 0) {
      n -= sub++;
      c++;
    }
    return 0 == n ? c : c - 1;
  }
}
