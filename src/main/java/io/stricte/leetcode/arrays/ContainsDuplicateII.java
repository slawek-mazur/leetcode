package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/contains-duplicate-ii/
/*
Runtime: 1302 ms, faster than 10.14% of Java online submissions for Contains Duplicate II.
Memory Usage: 41.8 MB, less than 89.02% of Java online submissions for Contains Duplicate II.
*/
public class ContainsDuplicateII {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (null == nums || nums.length < 2 || 0 == k) {
      return false;
    }

    /*
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!hs.add(nums[i])) {
        return true;
      }
      if (i >= k) {
        hs.remove(nums[i - k]);
      }
    }
    return false;
    */
    int lo = 0, hi = 1, n = nums.length - 1;
    while (lo < n) {
      while (hi - lo <= k && hi <= n) {
        if (nums[lo] == nums[hi++]) {
          return true;
        }
      }
      lo++;
      hi = lo + 1;
    }
    return false;
  }
}
