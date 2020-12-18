package io.stricte.leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/
/*
Runtime: 3 ms, faster than 99.55% of Java online submissions for Contains Duplicate.
Memory Usage: 42 MB, less than 95.76% of Java online submissions for Contains Duplicate.s
*/
public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    if (null == nums || nums.length < 2) {
      return false;
    }

    // or Set<Integer> O(n) space vs O(nlogn) time.
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] == nums[i]) {
        return true;
      }
    }
    return false;
  }
}
