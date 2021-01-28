package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/maximum-subarray/
/*
Runtime: 1 ms, faster than 49.79% of Java online submissions for Maximum Subarray.
Memory Usage: 41 MB, less than 9.98% of Java online submissions for Maximum Subarray.
*/
public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int res = nums[0], max = res, n = nums.length;
    for (int i = 1; i < n; i++) {
      max = Math.max(nums[i], nums[i] + max);
      res = Math.max(res, max);
    }
    return res;
  }
}
