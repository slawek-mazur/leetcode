package io.stricte.leetcode.numbers;

public class ReverseInteger {

  public int reverse(int x) {
    int ten = 10;
    long res = 0;
    while (x != 0) {
      int n = x % 10;
      res = res * ten + n;
      x /= 10;
    }
    return res < Integer.MIN_VALUE || res > Integer.MAX_VALUE ? 0 : (int) res;
  }
}
