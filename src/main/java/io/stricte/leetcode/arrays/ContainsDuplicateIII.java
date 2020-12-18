package io.stricte.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/contains-duplicate-iii/
/*

 */
public class ContainsDuplicateIII {

  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    if (null == nums || nums.length < 2 || 0 == k) {
      return false;
    }

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        int index = map.get(nums[i]);
        int distance = i - index;
        int difference = i - index;

      } else {
        map.put(nums[i], i);
      }
    }
    return false;
  }
}
