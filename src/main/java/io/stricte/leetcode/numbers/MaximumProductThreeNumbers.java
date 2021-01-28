package io.stricte.leetcode.numbers;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/
/*
Runtime: 11 ms, faster than 15.37% of Java online submissions for Maximum Product of Three Numbers.
Memory Usage: 40.9 MB, less than 16.37% of Java online submissions for Maximum Product of Three Numbers.
*/
public class MaximumProductThreeNumbers {

  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);

    /*
    int n = nums.length, res = nums[0] * nums[1] * nums[2];
    for (int i = 1; i < n; i++) {
      res = Math.max(res, nums[i] * nums[(i + 1) % n] * nums[(i + 2) % n]);
    }
    return res;
    */
    return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
  }
}
