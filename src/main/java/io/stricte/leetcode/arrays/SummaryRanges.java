package io.stricte.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/summary-ranges/
/*
Runtime: 7 ms, faster than 24.79% of Java online submissions for Summary Ranges.
Memory Usage: 37.5 MB, less than 50.31% of Java online submissions for Summary Ranges.
*/
public class SummaryRanges {

  public List<String> summaryRanges(int[] nums) {
    if (0 == nums.length) {
      return Collections.emptyList();
    }
    if (1 == nums.length) {
      return Collections.singletonList(nums[0] + "");
    }

    List<String> res = new ArrayList<>();
    int prev = nums[0], start = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (1 != nums[i] - prev) {
        res.add((start == prev) ? start + "" : start + "->" + prev);
        start = nums[i];
      }
      prev = nums[i];
    }
    res.add((start == prev) ? start + "" : start + "->" + prev);
    return res;
  }
}
