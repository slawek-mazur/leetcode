package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/sqrtx/
/*
Runtime: 3 ms, faster than 10.87% of Java online submissions for Sqrt(x).
Memory Usage: 38.2 MB, less than 5.24% of Java online submissions for Sqrt(x).
*/
public class Sqrt_x {

  public int mySqrt(int x) {
    if (x < 2) {
      return x;
    }

    int l = 1, r = x;
    while (l <= r) {
      int mid = l + (r - l) / 2;

      if (mid == x / mid) {
        return mid;
      }

      if (mid < x / mid) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return l - 1;
  }
}
