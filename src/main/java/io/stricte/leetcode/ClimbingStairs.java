package io.stricte.leetcode;

// https://leetcode.com/problems/climbing-stairs/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
Memory Usage: 37.6 MB, less than 8.25% of Java online submissions for Climbing Stairs.
*/
public class ClimbingStairs {

  public int climbStairs(int n) {
    if (1 == n) {
      return n;
    }

    int first = 1, second = 2, tmp;
    for (int i = 3; i <= n; i++) {
      tmp = first + second;
      first = second;
      second = tmp;
    }
    return second;
  }
}
