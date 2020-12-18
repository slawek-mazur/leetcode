package io.stricte.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

  public int subarraySum(int[] nums, int k) {
    if (null == nums || nums.length < 1) {
      return 0;
    }

    int count = 0, sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int num : nums) {
      sum += num;
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.merge(sum, 1, Integer::sum);
    }
    return count;
  }
}
