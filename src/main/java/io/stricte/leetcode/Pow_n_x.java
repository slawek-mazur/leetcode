package io.stricte.leetcode;

public class Pow_n_x {

  public double myPow(double x, int n) {
    if (0 == x || 1 == x) {
      return x;
    }

    if (1 == n) {
      return x;
    }

    if (-1 == n) {
      return 1 / x;
    }

    if (0 == n) {
      return 1;
    }

    double res = 1;
    while (n != 0) {
      if ((n & 1) == 1) {
        res = (n > 0) ? res * x : res / x;
      }
      x *= x;
      n /= 2;
    }
    return res;
  }
}
