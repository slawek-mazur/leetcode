package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/valid-perfect-square/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
Memory Usage: 35.7 MB, less than 54.74% of Java online submissions for Valid Perfect Square.
*/
public class ValidPerfectSquare {

  public boolean isPerfectSquare(int num) {
    if (1 == num) {
      return true;
    }
    int lo = 1, hi = num / 2;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      int res = num / mid, tail = num % mid;
      if (tail == 0 && res == mid) {
        return true;
      } else if (res < mid) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return false;
  }
}
