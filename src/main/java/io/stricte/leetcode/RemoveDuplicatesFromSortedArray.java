package io.stricte.leetcode;

public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    if (null == nums || 0 == nums.length) {
      return 0;
    }
    if (1 == nums.length) {
      return 1;
    }

    int ans = 1, i = 0, j = 1;
    do {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
        ans++;
      }
      j++;

    } while (j < nums.length);
    return ans;
  }
}
