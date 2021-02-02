package io.stricte.leetcode.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// https://leetcode.com/problems/longest-harmonious-subsequence/
/*
Runtime: 48 ms, faster than 14.44% of Java online submissions for Longest Harmonious Subsequence.
Memory Usage: 66.2 MB, less than 5.83% of Java online submissions for Longest Harmonious Subsequence.
*/
public class LongestHarmoniousSubsequence {

  public int findLHS(int[] nums) {
    Map<Integer, Integer> map = Arrays.stream(nums).boxed()
      .collect(Collectors.groupingBy(i -> i, Collectors.summingInt(i -> 1)));

    int res = 0;
    for (Entry<Integer, Integer> e : map.entrySet()) {
      if (map.containsKey(e.getKey() + 1)) {
        res = Math.max(res, e.getValue() + map.get(e.getKey() + 1));
      }
    }
    return res;
  }
}
