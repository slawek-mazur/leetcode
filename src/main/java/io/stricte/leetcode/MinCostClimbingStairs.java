package io.stricte.leetcode;

// https://leetcode.com/problems/min-cost-climbing-stairs/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Min Cost Climbing Stairs.
Memory Usage: 39.1 MB, less than 22.27% of Java online submissions for Min Cost Climbing Stairs.
*/
public class MinCostClimbingStairs {

  public int minCostClimbingStairs(int[] cost) {
    int first = cost[0], second = cost[1];
    // 1, 100, 1, 1, 1, 100, 1, 1, 100, 1
    for (int i = 2; i < cost.length; i++) {
      int curr = cost[i] + Math.min(first, second);
      first = second;
      second = curr;
    }
    return Math.min(first, second);
  }
}
