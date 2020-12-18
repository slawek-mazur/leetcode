package io.stricte.leetcode;

public class TargetSum {

  public int findTargetSumWays(int[] nums, int S) {
    return helper(nums, 0, 0, S);
  }

  private int helper(int[] nums, int index, int sum, int finalSum) {

    if (nums.length - 1 == index) {
      int res = 0;
      if (sum + nums[index] == finalSum) {
        res++;
      }
      if (sum - nums[index] == finalSum) {
        res++;
      }
      return res;
    }

    return helper(nums, index + 1, sum + nums[index], finalSum) +
      helper(nums, index + 1, sum - nums[index], finalSum);
  }
}
