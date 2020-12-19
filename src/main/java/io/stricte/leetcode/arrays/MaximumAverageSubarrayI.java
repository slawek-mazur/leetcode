package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/maximum-average-subarray-i/
/*
Runtime: 3 ms, faster than 72.56% of Java online submissions for Maximum Average Subarray I.
Memory Usage: 43.1 MB, less than 81.89% of Java online submissions for Maximum Average Subarray I.
*/
public class MaximumAverageSubarrayI {

  public double findMaxAverage(int[] nums, int k) {
    double res;
    int s = 0;
    for (int j = 0; j < k; j++) {
      s += nums[j];
    }
    res = s / (double) k;

    for (int i = 1, a = 0, b = k; i <= nums.length - k; i++, a++, b++) {
      s = s - nums[a] + nums[b];
      res = Math.max(res, s / (double) k);
    }
    return res;
  }
}
