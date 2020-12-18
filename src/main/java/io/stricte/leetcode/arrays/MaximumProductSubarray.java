package io.stricte.leetcode.arrays;

public class MaximumProductSubarray {

  public int maxProduct(int[] nums) {

    if (null == nums || 0 == nums.length) {
      return 0;
    }

    int res = nums[0], max = nums[0], min = nums[0], n = nums.length;
    for (int i = 1; i < n; i++) {
      int tmp = max;
      max = Math.max(nums[i], Math.max(nums[i] * max, nums[i] * min));
      min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * tmp));
      res = Math.max(res, max);
    }
    return res;

    /*
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int lastMax = nums[0];
    int lastMmin = nums[0];
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int localMax = Math.max(lastMax * nums[i], lastMmin * nums[i]);
      localMax = Math.max(localMax, nums[i]);
      lastMmin = Math.min(lastMmin * nums[i], lastMax * nums[i]);
      lastMmin = Math.min(lastMmin, nums[i]);
      max = Math.max(max, localMax);
      lastMax = localMax;

    }
    return max;

     */
  }
}
