package io.stricte.leetcode;

// https://leetcode.com/problems/binary-search/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
Memory Usage: 40.3 MB, less than 27.37% of Java online submissions for Binary Search.
*/
public class BinarySearch {

  public int search(int[] nums, int target) {

    int lo = 0, hi = nums.length - 1;
    while (lo <= hi) {
      int mid = lo + ((hi - lo) / 2);
      if (target == nums[mid]) {
        return mid;
      }
      if (nums[mid] < target) {
        lo = mid + 1;

      } else {
        hi = mid - 1;
      }
    }
    return -1;
  }
}