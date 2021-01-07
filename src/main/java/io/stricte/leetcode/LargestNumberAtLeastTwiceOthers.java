package io.stricte.leetcode;

// https://leetcode.com/problems/largest-number-at-least-twice-of-others/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Largest Number At Least Twice of Others.
Memory Usage: 36.6 MB, less than 88.46% of Java online submissions for Largest Number At Least Twice of
*/
public class LargestNumberAtLeastTwiceOthers {

  public int dominantIndex(int[] nums) {
    int index = -1, max = Integer.MIN_VALUE, nextMax = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        nextMax = max;
        max = nums[i];
        index = i;

      } else if (nums[i] > nextMax) {
        nextMax = nums[i];
      }
    }
    return nextMax * 2 > max ? -1 : index;
  }
}
