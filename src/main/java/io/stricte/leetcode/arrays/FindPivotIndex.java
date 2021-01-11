package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/find-pivot-index/
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
Memory Usage: 39.6 MB, less than 75.35% of Java online submissions for Find Pivot Index.
*/
public class FindPivotIndex {

  public int pivotIndex(int[] nums) {

    int s = 0;
    for (int num : nums) {
      s += num;
    }

    for (int i = 0, sl = 0; i < nums.length; i++) {
      if (s - 2 * sl == nums[i]) {
        return i;
      }
      sl += nums[i];
    }
    return -1;
  }
}
