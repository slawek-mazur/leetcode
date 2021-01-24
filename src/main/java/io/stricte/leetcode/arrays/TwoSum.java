package io.stricte.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum.
Memory Usage: 39.1 MB, less than 61.45% of Java online submissions for Two Sum.
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int a = 0, b = 0;

    for (int index = 0; index < nums.length; index++) {
      int num = nums[index];
      if (map.containsKey(num)) {
        return new int[]{map.get(num), index};

      } else {
        map.put(target - num, index);
      }
    }
    return new int[]{a, b};
  }
}
