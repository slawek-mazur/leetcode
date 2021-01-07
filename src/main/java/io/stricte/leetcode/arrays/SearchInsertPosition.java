package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/search-insert-position/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 38.4 MB, less than 94.06% of Java online submissions for Search Insert Position.
*/
public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int lo = 0, hi = nums.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (target < nums[mid]) {
        hi = mid - 1;

      } else if (target > nums[mid]) {
        lo = mid + 1;

      } else {
        return mid;
      }
    }
    return lo;
  }
}
