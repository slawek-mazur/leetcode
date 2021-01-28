package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/maximum-product-subarray/
/*
Runtime: 2 ms, faster than 31.25% of Java online submissions for Maximum Product Subarray.
Memory Usage: 39.9 MB, less than 5.05% of Java online submissions for Maximum Product Subarray.
*/
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
  }
}
