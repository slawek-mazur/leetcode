package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeros {

  public void moveZeroes(int[] nums) {
    if (null == nums || nums.length < 1) {
      return;
    }

    int l = 0, r = 0, n = nums.length;
    while (r < n) {
      if (0 != nums[r]) {
        nums[l++] = nums[r];
      }
      r++;
    }
    while (l < n) {
      nums[l++] = 0;
    }
  }
}
