package io.stricte.leetcode.arrays;

public class RunningSumOf1dArray {

  public int[] runningSum(int[] nums) {
    if (null == nums || nums.length < 2) {
      return nums;
    }
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    return nums;
  }
}
